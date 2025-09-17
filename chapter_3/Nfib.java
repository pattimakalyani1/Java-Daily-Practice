class Nfib
{
	public static void main(String [] args)
	{
	int f=0,s=1,t=0,num=10;
	for(int i=1;i<num;i++)
	{
		t=s+f;
		f=s;
		s=t;
	}
	System.out.println(f);
	}
}