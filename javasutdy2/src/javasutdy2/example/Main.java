package javasutdy2.example;

public final class Main {
	
	public static void main(String[] args) 
	{
		Ellipse Ell = new Ellipse();
		Ell.setP1P2(4, 0, 0,4);
		Ell.prt();
		Ell.resize(-8, 8);
		Ell.prt();
		Ell.move(0, 0);
		Ell.prt();
	
	}

}
