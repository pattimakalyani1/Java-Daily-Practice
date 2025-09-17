class Miss
{
	public static void main(String [] args)
	{
	
	for(int i=0;i<=9;i++)
	{
		int n=4567;
		boolean found=false;
		while(n!=0)
		{
			int rem=n%10;
			if(rem==i)
			{
				found=true;
				break;
			}
			n/=10;
		}
		if(found==false)
		{
			System.out.println(i);
		}
	}
	}
}				