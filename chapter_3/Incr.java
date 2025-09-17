class Incr
{
	public static void main(String [] args)
	{
		int n=124
		int rem1=n%10;
		int temp=n/10;
		while(temp!=0)
		{
			int rem=temp%10;
			if(rem1>rem)
			{
				temp/=10;
				System.out.println("Increasing");
				break;
			}
			else
			{      
				System.out.println("decreasing");
				break;
			}
		}
	}
}

				
					
				
				
				
		