class Fact
{
	public static void main(String [] args)
	{
		int n=345,temp=n,rem=0,sum=0;
		while(n!=0)
		{
			rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact*=i;		
			}
			sum+=fact;
			//System.out.println(sum);
			n/=10;
		}
		System.out.println(sum);
	}
}
			
			