/*
abstract final class A
{
	public static void main(String [] args)
	{
		m1();
	}
	  static void m1()
	{
		System.out.println("m1");
	}
}
	
//A.java:1: error: illegal combination of modifiers: abstract and final
//abstract final class A
//              ^
*/

class B
{
	public static void main(String [] args)
	{
		m1();
	}
	 static void m1()
	{
		System.out.println("m1");
	}
}
