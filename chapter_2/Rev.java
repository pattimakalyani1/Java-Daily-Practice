class Rev
{
	public static void main(String[] args)
	{
		int n=1234,rem=0,rev=0;
		while(n!=0)
		{
		rem=n%10;
		rev=rev*10+rem;
		n/=10;
		
		}
		System.out.println(rev);
		
	}
}