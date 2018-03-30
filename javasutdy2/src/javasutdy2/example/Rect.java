package javasutdy2.example;

import javasutdy2.example.Coordinate;

class Rect // 2개의 좌표와 가로,세로 길이를 알려주는 클래스
{
	private Coordinate LeftUpxy;
	private Coordinate RightDownxy;
	private double Length;
	private double Width;
	public Coordinate getLeftUpxy() {return LeftUpxy;}
	public Coordinate getRightDownxy() {return RightDownxy;}
	public double getLength() {return Length;}
	public double getWidth() {return Width;}
	public void setLeftUpxy(Coordinate LeftUpxy) {this.LeftUpxy = LeftUpxy;}
	public void setRightDownxy(Coordinate RightDownxy) {this.RightDownxy = RightDownxy;}
	public void setLength(double length) {Length = length;}
	public void setWidth(double width) {Width = width;}
	
	public Rect()
	{
		LeftUpxy=new Coordinate();
		RightDownxy=new Coordinate();
		Length=0.0;
		Width=0.0;
	}
	
	public double CalWidth(Coordinate LeftUpxy, Coordinate RightDownxy)
	{
		return RightDownxy.getX()-LeftUpxy.getX();
		
	}
	
	public double CalLength(Coordinate LeftUpxy, Coordinate RightDownxy)
	{
		return  LeftUpxy.getY()-RightDownxy.getY();
	}
	
	public void setLeftUpxy(double x, double y)
	{
		LeftUpxy.setXY(x, y);

		RightDownxy.setXY(x, y);
	}
	public void setRightDownxy(double x, double y)
	{
		RightDownxy.setXY(x, y);
	}
	
	public void prtrect()
	{
		Length=CalLength(LeftUpxy,RightDownxy);
		Width=CalWidth(LeftUpxy,RightDownxy);
		System.out.println("<사각형 정보>");
		System.out.print("좌 상단 꼭지점 좌표: ");
		LeftUpxy.prtXY();
		System.out.print("\n우 하단 꼭지점 좌표: ");
		RightDownxy.prtXY();
		System.out.println("\n세로 길이 : "+Length+"\n가로길이 : " + Width);
	}
	
	public void copy(Rect o)
	{
		LeftUpxy=o.LeftUpxy;
		RightDownxy=o.RightDownxy;
		Length=o.Length;
		Width=o.Width;
		
	}
		
	public void resize(double width, double length)
	{
		this.Width=width;
		this.Length=length;
		RightDownxy.setXY(LeftUpxy.getX()+width, LeftUpxy.getY()-length);
	}
	
	public void move(double x, double y)
	{
		LeftUpxy.setXY(x, y);
		RightDownxy.setXY(LeftUpxy.getX()+Width, LeftUpxy.getY()-Length);
	}
	
}