class Digit1
{
	public static void main(String [] args)
	{
		int n=5768,count=0;
		while(n!=0)
		{
			System.out.println(n%10);
			n=n/10;
			++count;
			System.out.println(count);
		}
		System.out.println("count: " +count);
	}
}