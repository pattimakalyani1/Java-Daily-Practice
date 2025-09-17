class Oddno
{
	public static void main(String [] args)
	{
		int n=12345,count=0,rem;
		while(n!=0)
		{
		rem=n%10;
		if(rem%2!=0)
			count++;
		n/=10;
		}
		System.out.println(count);
	}
}
		