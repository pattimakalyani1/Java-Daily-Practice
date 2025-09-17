class Rem
{
	public static void main(String [] args)
	{
	int n=4788349,rem=0,count=0,sum=0;
	while(n!=0)
	{
	++count;
	rem=n%10;
	if(count==1||count==4||count==6)
	{
		sum=sum+rem;
	}
	n/=10;
	}
	System.out.println(sum);
}
}
