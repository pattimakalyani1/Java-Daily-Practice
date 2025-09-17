class Ladder
{
	public static void main(String [] args)
	{
		int n=565;
		if(n>=0 && n<=9)
		{
			System.out.println("single digit");
		}
		 else if(n>=10 && n<=99)
		{
			System.out.println("two digit");
		}
		else if(n>=100 && n<=999)
		{
			System.out.println("three digit");
		}
		else
		{
			System.out.println("more than three digit");
		}
	}
}