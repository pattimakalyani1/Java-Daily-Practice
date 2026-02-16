interface A
{
	public abstract void m1();
}
interface B
{
	public abstract void m1();
}
class C implements A,B
{
	public static void main(String [] args)
	{
		C c=new C();
		c.m1();
	}
	public void m1()
	{
		System.out.println("m1");
	}
}