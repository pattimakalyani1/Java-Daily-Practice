class Number
{
	public static void main(String [] args)
	{
		int n=563,sum=0,f=0,s=1,t=0;
		while(n!=0)
		{
			sum+=n%10;
			n/=10;
		}
		for(int i=1;i<=(sum-2);i++)
		{
			t=s+f;
			f=s;
			s=t;
		 
		}
			System.out.println(t);
	}
}