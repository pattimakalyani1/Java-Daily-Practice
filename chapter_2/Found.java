class Found
{
	public static void main(String[] args)
	{
	int n=4507869,rem;
	boolean found=false;
	while(n!=0)
	{
	 rem=n%10;
	if(rem==6)
	{
		found=true;
		break;
	}
	n/=10;
	}
	System.out.println(found?"found":"not found");
	}
}
	