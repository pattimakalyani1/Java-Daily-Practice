class SecNum
{
	public static void main(String [] args)
	{
	int n=5971,max=0,rem;
        int copy=n,count=0,temp=n;
	while(n!=0)
	{
		rem=n%10;
		if(rem>max)
		{
			max=rem;
		}
		n/=10;
	}
	//System.out.println(max);
	
	while(copy!=0)
	{
		count++;
		if(copy%10==max)
		{
			break;
		}
		copy/=10;
	}
	//System.out.println(count);
	temp=temp-max*(int)Math.pow(10,count-1);
	//System.out.println(temp);
	int max1=0;
	while(temp!=0)
	{
		rem=temp%10;
		if(rem>max1)
		{
			max1=rem;
		}
		temp/=10;
	}
	System.out.println(max1);
	}
	
}

			