class Prime
{
	public static void main(String [] args)
	{
		for(int n=2;n<=100;n++)
		{
			int i=2;
			boolean isPrime =true;
			while(i<=n/2)
			{
			if(n%i==0)
			{
			isPrime=false;
			break;
			}
			i++;
			}
		if(isPrime)
		{
			System.out.println(n+" ");
		}
		}
	}
}

			
			
			
			
			
			
