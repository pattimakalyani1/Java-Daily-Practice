//
interface Connection1
{
	public void m1();
}
interface Connection2
{
	public void m2();
}

class Child1 implements Connection1,Connection2
{
	public void m1()
	{
		System.out.println("m1");
	}
	
	public void m2()
	{
		System.out.println("m2");
	}
	
	public void m3()
	{
		System.out.println("m3");
	}
	public static void main(String [] args)
	{
		Connection2 c=new Child1();
		c.m1();
		c.m2();

	}
}

/*

Child.java:30: error: cannot find symbol
                c.m1();
                 ^
  symbol:   method m1()
  location: variable c of type Connection2

*/

