class Swap
{
	public static void main(String [] args)
	{
		int n=12345,a=0,b=0,rem=0,rev=0,rem1=0,rev1=0;
		a=n%10;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		b=rev%10;
		while(rev!=0)
		{
			rem1=rev%10;
			if(rem1==b)
			{
				rem1=a;
			}
			else if(rem1==a)
			{
				rem1=b;
			}
			rev1=rev1*10+rem1;
			rev/=10;
		}
		System.out.println(rev1);
	}
}
		