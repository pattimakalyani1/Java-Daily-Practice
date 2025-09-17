class Adding
{
	public static void main(String [] args)
	{
		int n=479,rem=0,rev=0,sum=0;
		while(n!=0)
		{
			rem=n%10;
			sum=rem+1;
			if(sum==10)
			{
			 rem=0;
			}
			rev=rev*10+sum;
			n/=10;
		}
		System.out.println(rev);
	}
}
			