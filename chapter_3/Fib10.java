class Fib10
{
	public static void main(String [] args)
	{
		int i,f=0,s=1,t=0,nth=10;
		for( i=1;i<=(nth-2);i++)
		{
			t=s+f;
			f=s;
			s=t;
		}
		System.out.println(t);
	}
}	
																																																																																																																																																					