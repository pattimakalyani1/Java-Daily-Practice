class Check
{
	public static void main(String [] args)
	{
		int n=469874,rem=0,count1=0,count=0,temp=n;
		String s="no";
		while(n!=0)
		{
		count++;
		n/=10;
		}
		do{
		count1++;
		rem=temp%10;
		if(rem%2==0)
		System.out.println(rem+"is even");
		else
		System.out.println(rem+"is odd");
		if(count1<count)
		{
		System.out.println("do you want to check another digit");
		System.out.println(s);
		}
		if(s=="no")
		{
		temp=0;
		}
		else
		temp/=10;
		}
		while(temp!=0);
	}
}
		