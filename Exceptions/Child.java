class Child extends Parent
{
	public static void main(String[] args)
	{
		Parent p=new Child();
		p.m1();
	}
	
	static void m1()
	{
		System.out.println("I am child");
	}
}

class Parent
{
	static void m1()
	{
		System.out.println("I am parent");
	}
}