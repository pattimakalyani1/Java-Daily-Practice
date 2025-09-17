class Facto
{
	public static void main(String [] args)
	{
		double j;
		for(j=1;j<=100;j++)
		{
			double fact=1,i;
			for(i=1;i<=j;i++)
			{
				fact=fact*i;
			}
		System.out.println( j+":"+fact);
		}
	}
}
