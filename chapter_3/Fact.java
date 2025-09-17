class Fact
{
	public static void main(String [] args)
	{
		int fact=1,num=5;
		// forward iteration
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
		//backward iteration
		 int fact1=1;
		for(int i=num;i>=1;i--)
		{
			fact1*=i;
			
		}	
		System.out.println(fact1);
	}
}