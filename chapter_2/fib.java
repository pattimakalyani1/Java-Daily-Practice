class fib
{
	public static void main(String[] args)
	{
		int f=0,s=1,t;
		System.out.println(f);
		System.out.println(s);
		for(int i=1;i<=10;i++)
		{
			t=s+f;
			System.out.println(t);
			f=s;
			s=t;
		}
	}
}