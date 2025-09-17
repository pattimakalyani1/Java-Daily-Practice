classs Prime1
{
	public static void main(String [] args)
	{
		int n=1000,count=0;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				count++;
				System.out.println("not a prime number");
				break;
			}
		}
		if(count==0)
		System.out.println("prime");
	}
}