class Digitsq
{
	public static void main(String[] args)
	{
		int n=1234,rem=0;
		while(n!=0)
		{
		rem=n%10;
		System.out.println((int)(Math.pow(rem,2)));
		n/=10;
		
		}
		
	}
}