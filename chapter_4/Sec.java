class Sec
{
	public static void main(String [] args)
	{
		int n=1254;
		int max2=0,max1=0,rem=0;
		while(n!=0)
		{
			rem=n%10;
			if(rem>max1)
			{
				max2=max1;
				max1=rem;
			}
			else if(rem>max2 && rem!=max1)
			{
				max2=rem;
			}
			n/=10;
		}
		System.out.println(max2);
	}
}
		