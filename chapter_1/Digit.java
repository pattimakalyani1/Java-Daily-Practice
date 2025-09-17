class Digit
{
	public static void main(String [] args)
	{
	int n=123;
	while(n!=0)
	{
		System.out.println((n%10)+1);
		n/=10;
	}
	}
}