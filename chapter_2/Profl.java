class Profl
{
	public static void main(String[] args)
	{
	int n=12458,rem=0,count=0,temp=n,pro=1;
	while(n!=0)
	{
		count++;
		n/=10;
	}
	int count1=count;
	while(temp!=0)
	{
		rem=temp%10;
		if(count1!=count && count!=1)
		{
			pro=pro*rem;	
		}
		temp/=10;
		--count;
	}
	System.out.println(pro);
	}
}