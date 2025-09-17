class Alter
{
	public static void main(String [] args)
	{
		int n=123821,count=0,temp=n,rem=0,sum=0,sum1=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		int half=count/2;
		while(temp!=0)
		{
		rem=temp%10;
		if(count%2==0)
		{
			sum=sum+rem;
			
		}
		else
		{
			sum1=sum1+rem;
			

		}
		--count;
		temp/=10;
		}
		System.out.println("sum of even digits:"+sum);
		System.out.println("sum of odd digits:"+sum1);

		
	}
}