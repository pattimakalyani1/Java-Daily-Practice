class Palindrome
{
	public static void main(String [] args)
	{
		Number number;
		number=new Number();
		number.calPalin();
	}
}
class Number
{
	void calPalin()
	{
		int n=122,temp=n,rev=0;
		while(n!=0)
		{
			rev=rev*10+(n%10);
			n/=10;
		}
		System.out.println(rev==temp?"Palindrome":"not palindrome");
	}
	
}