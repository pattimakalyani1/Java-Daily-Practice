class Ldigit
{
	public static void main(String [] args)
	{
		int num=455;
		int x;
		x=num%10;
		if(x%2==0)
		{
			System.out.println("last digit is even "+num);
		}
		else
		{
			System.out.println("last digit is odd "+num);
		}
	}
}