class Lucky
{
	public static void main(String [] args)
	{
		int n=123321,count=0,temp=n,rem=0,sum=0,sum1=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		int half=count/2;
		while(temp!=0)
		{
		--count;
		rem=temp%10;
		if(count>=half)
		{
			sum=sum+rem;
			
		}
		else
		{
			sum1=sum1+rem;
			

		}
		temp/=10;
		}
		
		System.out.println(sum==sum1?"lucky":"not a lucky");
	}
}