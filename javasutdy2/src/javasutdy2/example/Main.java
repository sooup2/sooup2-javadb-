package javasutdy2.example;

public class Main {

	public static void main(String[] args) {
		
		Rect1 rect1 = new Rect1();
		Rect2 rect2 = new Rect2();
		
		System.out.print("1. ");
		rect1.printXY();
		System.out.print("2. ");
		rect2.printXYAD();
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
		this.x = 0;
		this.y = 0;
	}
}

class Rect1{
	
	static Point spot = new Point();
	
	public void printXY()
	{
		System.out.print("사각형을 이루는 4개의 점의 좌표는 ");
		spot.SetXY(0,0);
		System.out.print("("+spot.getX()+","+spot.getY()+"),");
		spot.SetXY(3,0);
		System.out.print("("+spot.getX()+","+spot.getY()+"),");
		spot.SetXY(0,3);
		System.out.print("("+spot.getX()+","+spot.getY()+"),");
		spot.SetXY(3,3);
		System.out.println("("+spot.getX()+","+spot.getY()+")입니다.");
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
		System.out.print("사각형은 좌표 ");
		System.out.print("("+spot.getX()+","+spot.getY()+")을 기준으로 ");
		System.out.print("가로길이 " + across+", ");
		System.out.println("세로길이 " + down + "입니다.");
	}
}

class Rect3{
	
	private Point leftUp;
	private Point RightDown;
}