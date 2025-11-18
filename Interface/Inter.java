interface Connect
{
	void m2();
	 default void m1()
	{
		System.out.println("m1");
	}
	int a=10;
}

class C implements Connect
{
	
	 public void m2()
	{
		System.out.println("m2 C");
	}

	
	public void m1()
	{
		System.out.println("void m1");
	}
}

class V implements Connect
{
	public void m2()
	{
		System.out.println("m2 V");
	}

}
class Main{
	public static void main(String [] args)
	{
		Connect co=new C();
		co.m2();
		co.m1();
	
		Connect co1=new V();
		co1.m2();
		co1.m1();
		System.out.println(Connect.a);
		
		
	}
}
