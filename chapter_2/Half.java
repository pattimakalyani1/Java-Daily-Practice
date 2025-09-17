class Half
{
	public static void main(String [] args)
	{
	long n=4567897654l,n1,n2,sum,temp,rem=0l,rev=0l;
	long org_n=n;
	int count=0,power;
	while(n!=0)
	{
	n=n/10;
	count++;
	}
	power=count/2;
	n1=(long)(org_n%Math.pow(10,power));
	n2=(long)(org_n/Math.pow(10,power));
	sum=n1+n2;
	temp=sum;
	while(sum!=0)
	{
	rem=sum%10;
	rev=rev*10+rem;
	sum/=10;
	}
	System.out.println(rev==temp?"palindrome":"not palindrome");
	}
}
