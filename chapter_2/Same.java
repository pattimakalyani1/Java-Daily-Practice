class Same
{
	public static void main(String [] args)
	{
	int n=11211,rem=0;
	int rem1=n%10;
	boolean status=false;
	while(n!=0)
	{
	rem=n%10;
	if(rem!=rem1)
	{
	status=true;
	break;
	}
	n/=10;
	}
	System.out.println(status?"digits are different":"digits are same");
	}
}
	