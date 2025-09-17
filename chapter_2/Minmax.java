class Minmax
{
	public static void main(String [] args)
	{
	int n=245476,rem,min=9,max=0,sum;
	while(n!=0)
	{
	rem=n%10;
	if(rem<min)
	{
		min=rem;
	}
	if(rem>max)
	{
		max=rem;
	}
	n/=10;
	}
	sum=min+max;
	System.out.println(sum);
	}
}