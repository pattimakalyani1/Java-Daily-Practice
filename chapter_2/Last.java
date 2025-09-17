class Last
{
	public static void main(String [] args)
	{
		int n=345678,rem=o,count=0;
		int temp=n%10;
		while(n!=0)
		{
		rem=n%10;		
		n/=10;
		}
		System.out.println(temp+rem);
	}
}