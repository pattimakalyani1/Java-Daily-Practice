class Incre
{
	public static void main(String [] args)
	{
	int n=125,rem=0,temp=0,count=0,count1=0,count2=0;
	int re1=n%10;	
	while(n!=0)
	{
		
		rem=n%10;
		if(rem<re1)
		{	
			if(rem==(re1-count))
			{
		          count1++;
				n/=10;
			
			}
			else
			{
				System.out.println(re1-count);
				
			}
					
		}
		else
		{
			n/=10;
		}
		++count;
		
	}
	System.out.println((count1==(count-1))?"increasing":"not increasing");
	}
}
		
		
