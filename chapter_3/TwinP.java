class TwinP
{
	public static void main(String [] args)
	{
		int x,num=7,count=0,temp=0;
		for(x=2;x<=num/2;x++)
		{
			if(num%x==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{ 
			temp=num+2;
			int i, count1=0;
			for(i=2;i<=temp/2;i++)
			{
				if(temp%2==0)
				{
					count1++;
					break;
				}
			}
			System.out.println(count1==0?"twin prime":"not a twin prime");
		}
		else
		{
			System.out.println("number is not a prime");
		}
	}
}
			
				