class FirLas
{
	public static void main(String [] args)
	{
	int n=3456789,rem=0,count=0,temp=n,sum=0;
	while(n!=0)
	{
		count++;
		n/=10;
	}
	 int count1=count;
	while(temp!=0)
	{             
		rem=temp%10;
		if(count1==count||count==1)
		{
			sum=sum+rem;
		}
		temp/=10;
		--count;
		
	}System.out.println(sum);
		

	}
}