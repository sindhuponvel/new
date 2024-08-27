package javalearning;

class Parent
{
	String name;
	int age;
	
	public Parent(String n,int a)
	{
		this.name=n;
		this.age=25;
		System.out.println(name);
		System.out.println(age);
	}
		
	
}

public class Child  extends Parent{
	String location;
	
	public Child(String n,int a,String loc)
	{
		super( "Sindhu", a);
		this.location="chennai";
		System.out.println(location);
		
	}
	public static void main(String[] args) {
		Child c = new Child(null, 0, null);
	}

}








