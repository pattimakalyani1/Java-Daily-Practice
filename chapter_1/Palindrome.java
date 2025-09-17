class Palindrome
{
	public static void main(String [] args)
	{
		int n=1121,rem=0,rev=0;
		int org_n=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println(org_n==rev ? "palindrome" :"not a palindrome");
	}
}
		