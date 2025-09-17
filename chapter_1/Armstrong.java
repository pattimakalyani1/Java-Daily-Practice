class Armstrong
{
	public static void main(String [] args)
	{
	int n=370,rem=0,sum=0,count=0;
	int org_n=n,temp=n;
	while(n!=0)
	{
		count++;
		n/=10;
	}
	System.out.println(count);
	while(org_n!=0)
	{
		rem=org_n%10;
		sum=sum+(int)(Math.pow(rem,count));
		org_n=org_n/10;
	}
	System.out.println(sum);
	System.out.println(sum==temp?"armstrong":"not a armstring");
	}
}