package javasutdy2.example;

class Coordinate {
	
	private double x;
	private double y;

	public void setX(double x) { this.x = x; }
	public void setY(double y) { this.y = y; }
	public double getX() { return x; }
	public double getY() { return y; }
	
	
	
	public Coordinate()//��ǥ �ʱⰪ �⺻ ���� ������
	{
		setX(0);
		setY(0);
	}
	
	public Coordinate(double x, double y)//��ǥ �ʱⰪ ���� ������
	{
		setX(x);
		setY(y);
	}
	
	public void setXY(double x, double y)//��ǥ�� ���� �޼ҵ�
	{
		setX(x);
		setY(y);
	}
	
	public void prtXY() //��ǥ�� ��� �޼ҵ�
	{
		System.out.print("("+x+", "+y+")");
	}

	public void setprtXY(double x, double y) //��ǥ�� ���� �� ��� �޼ҵ�
	{
		setX(x);
		setY(y);
		System.out.print("("+x+", "+y+")");
	}

}
