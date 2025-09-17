class Twodigit
{
	public static void main(String [] args)
	{
	int n1=225;
	double n2=Math.sqrt(n1);
	System.out.println(n2);
		if(n1>=10 && n1<=99)
		{
			if(n1%2==0)
			{
				System.out.println("its is 2 digit even number");
			}
			else
			{
				System.out.println("it is 2 digit odd number");
			}
		}
		else
		{
			if(0<(int)n2/n2 && (int)n2/n2<1)
			{
				System.out.println("it is a  not perfect square");
			}
			else
			{
				System.out.println("it is a perfect square");
			}
		}
		/*System.out.println((n1>=10 && n1<=99)?((n1%2==0)?("its a 2 digit even number"):("it is a 2 digit odd number")):((n2%1==0)?("it is a perfect Square"):(" it is not a perfect square")));*/

	}
}

