class Palin
{
	public static void main(String [] args)
	{
		int rem=0,rev=0;
		for(int i=1;i<=100;i++)
		{       int temp=i;
			while(i!=0)
			{
				rem=i%10;
				rev=rev*10+rem;
				System.out.println(rev);
				i/=10;
			}
			
			if(rev==temp)
			{
				System.out.println(temp);
			}
		}
	}
}
		
