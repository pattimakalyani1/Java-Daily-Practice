class Div
{
	public static void main(String [] args)
	{
		int n=3456788,count=0,rem;
		while(n!=0)
		{
			rem=n%10;
			if(rem%4==0)
				count++;
			n/=10;
		}
		System.out.println(count);
	}
}
	