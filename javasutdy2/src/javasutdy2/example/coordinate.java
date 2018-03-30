package javasutdy2.example;

class Coordinate {
	
	private double x;
	private double y;

	public void setX(double x) { this.x = x; }
	public void setY(double y) { this.y = y; }
	public double getX() { return x; }
	public double getY() { return y; }
	
	
	
	public Coordinate()//촤표 초기값 기본 설정 생성자
	{
		setX(0);
		setY(0);
	}
	
	public Coordinate(double x, double y)//좌표 초기값 설정 생성자
	{
		setX(x);
		setY(y);
	}
	
	public void setXY(double x, double y)//좌표값 변경 메소드
	{
		setX(x);
		setY(y);
	}
	
	public void prtXY() //좌표값 출력 메소드
	{
		System.out.print("("+x+", "+y+")");
	}

	public void setprtXY(double x, double y) //좌표값 변경 및 출력 메소드
	{
		setX(x);
		setY(y);
		System.out.print("("+x+", "+y+")");
	}

}
