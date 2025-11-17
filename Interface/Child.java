//multiple inheritance using interface
interface Connection1
{
	public void m1();
}
interface Connection2
{
	public void m2();
}

class Child implements Connection1,Connection2
{
	public void m1()
	{
		System.out.println("m1");
	}
	
	public void m2()
	{
		System.out.println("m2");
	}
	public static void main(String [] args)
	{
		Child child=new Child();
		child.m1();
		child.m2();
	}
}

/*

m1
m2

*/