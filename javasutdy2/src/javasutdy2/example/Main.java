package javasutdy2.example;

public class Main {

	public static void main(String[] args) {
		
		Rect1 rect1 = new Rect1();
		Rect2 rect2 = new Rect2();
		Rect3 rect3 = new Rect3();
		
		System.out.print("1. ");
		rect1.printXY();
		System.out.print("2. ");
		rect2.printXYAD();
		System.out.println("3. ");
		rect3.prtRect();
	}

}

class Point{
	private int x;
	private int y;
	public void setX(int x){this.x = x;}
	public void setY(int y){this.y=y;}
	public int getX(){return x;}
	public int getY(){return y;}

	public void SetXY(int x, int y)
	{
		this.setX(x);
		this.setY(y);
	}
	public Point ()
	{
		this.setX(x);
		this.setY(y);
	}
	
	public Point (Point p)
	{
		this.setX(p.x);
		this.setY(p.y);
	}

	public void printXY()
	{
		System.out.print("("+x+","+y+"),");
	}
}

class Rect1{
	
	static Point spot = new Point();
	
	public void printXY()
	{
		System.out.print("�簢���� �̷�� 4���� ���� ��ǥ�� ");
		spot.SetXY(0,0);
		System.out.print("("+spot.getX()+","+spot.getY()+"),");
		spot.SetXY(3,0);
		System.out.print("("+spot.getX()+","+spot.getY()+"),");
		spot.SetXY(0,3);
		System.out.print("("+spot.getX()+","+spot.getY()+"),");
		spot.SetXY(3,3);
		System.out.println("("+spot.getX()+","+spot.getY()+")�Դϴ�.");
	}
	
}

class Rect2{
	
	static Point spot = new Point();
	private double across;
	private double down;
		
	public double getAcross() {return across;}
	public void setAcross(double across) {this.across = across;}
	public double getDown() {return down;}
	public void setDown(double down) {this.down = down;}

	public void printXYAD()
	{
		spot.SetXY(0,0);
		across=3.0;
		down=3.0;
		System.out.print("�簢���� ��ǥ ");
		System.out.print("("+spot.getX()+","+spot.getY()+")�� �������� ");
		System.out.print("���α��� " + across+", ");
		System.out.println("���α��� " + down + "�Դϴ�.");
	}
}

class Rect3{
	
	private Point leftUp = new Point();
	private Point RightDown = new Point();
	private double Widht;
	private double height;
	public Point getLeftUp() {return leftUp;}
	public void setLeftUp(Point leftUp) {this.leftUp = leftUp;}
	public Point getRightDown() {return RightDown;}
	public void setRightDown(Point rightDown) {RightDown = rightDown;}
	public double getWidht() {return Widht;}
	public void setWidht(double widht) {Widht = widht;}
	public double getHeight() {return height;}
	public void setHeight(double height) {this.height = height;}
	
	
	
	public double calWid()
	{
		return RightDown.getX()-leftUp.getX();
	}
	public double calHei()
	{
		return leftUp.getY()-RightDown.getY();
	}
	
	public void prtRect()
	{
		System.out.print("�� �簢���� �»�� ��ǥ ");
		leftUp.printXY();
		System.out.print("�� �ϴ� ��ǥ ");
		RightDown.printXY();
		System.out.println("���α���" + calWid()+ "���α��� " + calHei()+"�� �̷���� �ֽ��ϴ�.");
	}
	
	
}
