class Sum
{
	public static void main(String [] args)
	{
		int n=12345,sum,firDig,count=0,lastDig,temp=n;
		lastDig=n%10;
		while(n>=10)
		{
		n/=10;	
		}
		firDig=n;
		sum=firDig+lastDig;
		System.out.println(sum);
}
}

		
		