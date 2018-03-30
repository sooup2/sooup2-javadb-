package javasutdy2.example;

public class Ellipse {
	private Coordinate P1;
	private Coordinate P2;
	private double ldia;
	private double wdia;

	public Coordinate getP1() {
		return P1;
	}
	public void setP1(Coordinate p1) {
		P1 = p1;
	}
	public Coordinate getP2() {
		return P2;
	}
	public void setP2(Coordinate p2) {
		P2 = p2;
	}
	public double getLdia() {
		return ldia;
	}
	public void setLdia(double ldia) {
		this.ldia = ldia;
	}
	public double getWida() {
		return wdia;
	}
	public void setWida(double wida) {
		this.wdia = wida;
	}

	public Ellipse()
	{
		P1=new Coordinate();
		P2=new Coordinate();
		ldia=0;
		wdia=0;
	}
	
	public void setP1P2(double x1, double y1, double x2, double y2)
	{
		P1.setXY(x1, y1);
		P2.setXY(x2, y2);
	}
	public void sort()
	{ 
		double tmp;
		System.out.println(P1.getX()+","+P2.getX());
		if(P1.getX()>P2.getX());
		{
			tmp=P1.getX();
			P1.setX(P2.getX());
			P2.setX(tmp);
		}
		System.out.println(P2.getY()+","+P1.getY());
		if(P2.getY()>P1.getY());
		{
			tmp=P2.getY();
			P2.setY(P1.getY());
			P1.setY(tmp);
		}
	}
	
	public void callwdia()
	{
		sort();
		ldia=P1.getY()-P2.getY();
		wdia=P2.getX()-P1.getX();
	}

	
	public void prt()
	{
		callwdia();
		System.out.print("첫번째 좌표 : ");
		System.out.println("("+P1.getX()+","+P1.getY()+")");
		System.out.print("두번째 좌표 : ");
		System.out.println("("+P2.getX()+","+P2.getY()+")");
		System.out.println("세로길이 : "+ldia);
		System.out.println("가로길이 : "+wdia);
		System.out.println("위와 같은 정보로 이루어진 '타원' ");
	}
	
	public void resize(double x, double y)
	{
		P2.setXY(x, y);
	}
		
	public void move(double x, double y)
	{
		P1.setXY(x, y);
		P2.setXY(P1.getX()+wdia, P1.getY()-ldia);
	}
		
}