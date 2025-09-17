class Mindig
{
	public static void main(String [] args)
	{
	int n=245476,rem,min=9;
	while(n!=0)
	{
	rem=n%10;
	if(rem<min)
	{
		min=rem;
	}
	n/=10;
	}
	System.out.println(min);
	}
}