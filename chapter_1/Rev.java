class Rev
{
	public static void main(String [] args)
	{
		int n=346,rem=0,rev=0,rem1;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		
		while(rev!=0)
		{
			rem1=rev%10;
			switch(rem1)
			{
			case 1-> System.out.println("one");
			case 2-> System.out.println("two");
			case 3-> System.out.println("three");
			case 4-> System.out.println("four");
			case 5-> System.out.println("five");
			case 6-> System.out.println("six");
			case 7-> System.out.println("seven");
			case 8-> System.out.println("eight");
			case 9-> System.out.println("nine");
			case 0-> System.out.println("zero");
			}
			rev/=10;
		}
	}
}				