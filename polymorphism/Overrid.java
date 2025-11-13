class Overrid
{
	public static void main(String [] args)
	{
		One one=new One();
		System.out.println(one.hai());	

	}
}
class One extends Two
{
	String hai()
	{
		return "One class hai";
	}
}
class Two 
{
	String hai()
	{
		return "Two class hai";
	}
}


//One class hai