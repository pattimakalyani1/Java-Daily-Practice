class Overrid1
{
	public static void main(String [] args)
	{
		One one=new One();
		//System.out.println(one.hai());	
		one.main(16);

	}
}
class One extends Two
{
	public static void main(int x)
	{
		System.out.println("i am child");
	}
	String hai()
	{
		return "One class hai";
	}
}
class Two 
{
	public static void main(int x)
	{
		System.out.println("i am parent");
	}
	String hai()
	{
		return "Two class hai";
	}
}

