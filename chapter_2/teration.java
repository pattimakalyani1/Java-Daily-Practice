class Iteration
{
	public static void main(String [] args)
	{
 		int n=670543,rem=0,count=0;
		while(n!=0)
		{
		count++;
		rem=n%10;
		n/=10;
		System.out.println(count+" "+rem);
		}
	}
}