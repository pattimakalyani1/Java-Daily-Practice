class SumDigits
{
	public static void main(String [] args)
	{
		int n=123,sum=0,rem=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n/=10;
		}System.out.println(sum);
	}
}