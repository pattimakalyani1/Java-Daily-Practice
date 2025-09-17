class Increm
{
	public static void main(String [] args)
	{
	int n=1235,rem=0,rev=0,count=0,count1=0,rem1=0;
	
	while(n!=0)
	{
		rem1=n%10;
		rev=rev*10+rem1;
		n/=10;
	}
	int re1=rev%10;	
	while(rev!=0)
	{
		
		rem=rev%10;
		if(rem>re1)
		{	
			if(rem==(re1+count))
			{
		               count1++;
				rev/=10;
			
			}
			else
			{
				
				System.out.println(re1+count);
				
			}
					
		}
		else
		{
			rev/=10;
		}
		++count;
		
	}
	System.out.println((count1==(count-1))?"increasing":"not increasing");
	}
}
