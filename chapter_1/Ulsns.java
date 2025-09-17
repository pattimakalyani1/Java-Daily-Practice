class Unicose
{
	public static void main(String [] args)
	{
		char ch='A';
		if(ch>='A' && ch<='Z')
		{
			System.out.println(" upper case");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println(" lower case");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println(" number");
		}
		else if(ch==' ')
		{
			System.out.println(" space");
		}
		else
		{
			System.out.println("symbol");
		}
	}
}