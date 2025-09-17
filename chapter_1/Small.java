class Small
{
	public static void main(String [] args)
	{
		int n1=92,n2=34,n3=45;
		if(n1<n2)
		{
			if(n1<n3)
			{
				System.out.println(n1+" is smallest number");
			}
			else
			{
				System.out.println(n3+" is smallest number");
		        }
		}
		else
		{
			if(n2<n3)
			{
				System.out.println(n2+" is smallest number");
			}
			else
			{
				System.out.println(n3+ " is smallest number");
			}
		}
	}
}