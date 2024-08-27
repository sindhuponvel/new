package javalearning;

class Pare{
	int a=11;
	public void m1()
	{
		System.out.println("From m1 of parent");
	}
	public void m2()
	{
		System.out.println("From m2 of parent");
	}
}


public class Childd extends Pare{
	int a=10;
	int b=6;
	public void m1()
	{
		System.out.println("From m1 of child");
	}
	public void m3()
	{
		System.out.println("From m3 of child");
	}
	public static void main(String[] args) {
		Pare p= new Pare();
		Childd c = new Childd();
		c.m1();
		System.out.println(p.a);
		p=c;
		
		
	}
		
		
		
		
	}


