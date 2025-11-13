class Overload
{
	public static void main(String [] args)
	{
		One one=new One();
		//System.out.println(one.hai());	
		System.out.println(one.hai(10));	


	}
}
class One extends Two
{
	String hai()
	{
		return "One class hai";
	}
	String hai(int x)
	{
		return "one class hai parameterized";
	}
}
class Two 
{
	String hai()
	{
		return "Two class hai";
	}
}


//one class hai parameterized