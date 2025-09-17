class Prime
{
	public static void main(String [] args)
	{
		int count1=0,sum=0;
		for(int i=1;i<=100;i++)
		{
			int count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && i!=1)
			{
			count1++;
			sum+=i;
			System.out.println(i);
			}
			
		}System.out.println("count:"+count1);
		System.out.println("sum:"+sum);
	}
}
		

class Prime1
{
	public static void main(String [] args)
	{
		
		for(int i=100;i>=1;i--)
		{
			int count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && i!=1)
			System.out.println(i);
			
		}
	}
}



		
	