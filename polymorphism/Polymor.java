class Polymor
{
	public static void main(String [] args)	
	{
	
		Parent parent=new Child();//upcasting
		parentq.m1();
		parent.m2();

	}
}
class Parent
{
	void m1()
	{
		System.out.println("I am parent m1");
	}

	void m2()
	{
		System.out.println("I am parent m2");
	}
}
class Child extends Parent
{
	void m2()
	{
		System.out.println("I am child m2");
	}

	void m3()
	{
		System.out.println("I am child m3");
	}

	void m0()
	{
		System.out.println("I am child m0");
	}
}


/*

I am parent m1
I am child m2

*/