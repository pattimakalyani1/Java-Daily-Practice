class Twinpri
{
	public static void main(String [] args)
	{
		int i, n1=3,n2=5,count=0;
		for(i=2;i<=n1/2 &&  i<n2/2 ;i++)
		{
			if(n1%i==0 && n2%2==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			int res=(n1>n2?n1-n2:n2-n1);
			System.out.println(res==2?"twin primes":"not twin primes");

		}
		else{
		System.out.println("prime numbers but not twin primes");
		}
	}
}
				
		
