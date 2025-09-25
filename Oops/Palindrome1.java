class PalindromePri
{
	public static void main(String [] args)
	{
		Number number;
		number=new Number();
		number.calPalin();
		number.calPrime();
	}
}
class Number
{
	void calPalin()
	{
		int n=121,temp=n,rev=0;
		while(n!=0)
		{
			rev=rev*10+(n%10);
			n/=10;
		}
		System.out.println(rev==temp?"Palindrome":"not palindrome");
	}
	void calPrime()
	{
		int count=0,n=121;
		for(int x=2;x<=n/2;x++)
		{
			if(n%x==0)
			{
				count++;
				break;
			}
		}
		System.out.print(count==0?"prime":"not a prime");

	}		
		
}