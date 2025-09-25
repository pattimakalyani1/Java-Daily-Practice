class Palindrome
{
	public static void main(String [] args)
	{
		Palin pal=new Palin();
		pal.num=121;
		pal.copy=pal.num;
		pal.calRev();
		pal.isPalin();
	}
}
class Palin
{
	int num,copy;
	int rev;
	void calRev()
	{
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
	}
	void isPalin()
	{
		System.out.println(rev==copy?"palindrome":"not palindrome");
	}
	
}