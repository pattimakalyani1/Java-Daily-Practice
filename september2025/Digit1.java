class Digits
{
	public static void main(String [] args)
	{
		int n=5768,rem;
		while(n!=0)
		{
			rem=num%10;
			n=n/10;
			System.out.println(num+" "+rem);
		}
		System.out.println(num+" "+rem);
	}
}