class Armstrong
{
	public static void main(String[] args)
	{
		int n=153,rem=0,sum=0,temp=n,n1=n,count=0;
		while(n1!=0)
		{
		count++;
		n1/=10;
		}

		while(n!=0)
		{
		rem=n%10;
		sum=sum+(int)(Math.pow(rem,count));
		n/=10;
		
		}
		System.out.println(temp==sum?"armstrong":"not a armstrong");
	}
}