class Psc
{
	public static void main(String [] args)
	{
		int N=100,count=0;
		
		for(int n=2;n<=N;n++)
		{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
		boolean isprime=true;
			if(n%i==0)
			{
			isprime=false;
			break;					
			}
		}
		
		if(isprime)
		System.out.println(n);
		}
	}
}