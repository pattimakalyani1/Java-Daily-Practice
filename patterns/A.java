class A
{
	void m1()
	{
		System.out.println("m1 in A");
	}
}

class B
{
	void m1()
	{
		System.out.println("m1 in B");
	}
}

class C extends A,B
{
	public static void main(String [] args)
	{
		C c=new C();
		c.m1();
	}
}
