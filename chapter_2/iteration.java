class Iteration
{
	public static void main(String [] args)
	{
 		int n=64325,rem=0,count=0,sum=0,sum1=0,sum2=0;
		while(n!=0)
		{
		count++;
		rem=n%10;
		if(count==1||count==5)
		{
			sum=sum+rem;
		}
		else if(count==2 ||count==4)
		{
			sum1=sum1+rem;
		}
		else
		{
			sum2=rem;
		}
		n/=10;
		}
		System.out.println((sum*sum1)+sum2);

	}
}