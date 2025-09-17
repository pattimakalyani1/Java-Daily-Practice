class Arm
{
	public static void main(String [] args)
	{
		int count1=0,sum1=0; 
		for(int i=99;i<=1000;i++)
		{
			 int temp=i,count=0;
			int n=temp;
			while(n!=0)
			{
				count++;
				n/=10;
				
			}
			System.out.println(count);
			n=temp;
			int rem=0,sum=0;
			while(n!=0)
			{
				rem=n%10;
				//System.out.println(rem);
				sum=sum+(int)Math.pow(rem,count);
				n/=10;
		
			}

			if(sum==temp)
			{
			//System.out.println(count1);
			count1++;
			sum1+=temp;
			}
		}
		System.out.println("count:"+count1);
		System.out.println("sum:"+sum1);
		
	}
}

			
				
				
			
