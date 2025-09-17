class Swapping
{
	public static void main(String [] args)
	{
		int n=2;
		int a=25,b=9;
		if(n%5==0 && n%3==0)
		{
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("swapping occurs");
			System.out.println( "a:"+a+" "+"b:"+b);
		}
		else if (n%5==0 ||n%3==0)
		{
			System.out.println("no swapping occurs");
			System.out.println( "a:"+a+" "+"b:"+b);
		}
		else
		{
			System.out.println("sum of a and b occurs");
			System.out.println("a+b:" +(a+b));
		}
	}
}
