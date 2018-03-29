package javasutdy2.example;

public class Main {

	public static void main(String[] args) {
		Rect.printXY();
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
		this.x=x;
		this.y=y;
	}
	public Point ()
	{
		this.x = 0;
		this.y = 0;
	}
}

class Rect{
	
	static Point spot = new Point();
	
	public static void printXY()
	{
		System.out.print("사각형을 이루는 4개의 점의 좌표는 ");
		spot.SetXY(0,0);
		System.out.print("("+spot.getX()+","+spot.getY()+"),");
		spot.SetXY(3,0);
		System.out.print("("+spot.getX()+","+spot.getY()+"),");
		spot.SetXY(0,3);
		System.out.print("("+spot.getX()+","+spot.getY()+"),");
		spot.SetXY(3,3);
		System.out.print("("+spot.getX()+","+spot.getY()+")입니다.");
	}
}
