class DigitNo
{
	public static void main(String[] args)
	{
		int n=1234,count=0;
		while(n!=0)
		{
		n/=10;
		count++;
		}
		System.out.println(count);
	}
}