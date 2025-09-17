class Hcom
{
	public static void main(String [] args)
	{
	int n1=16,n2=32,res=0;
	res=n1>n2?n2:n1;
	for(int i=res;i>=1;i--)
	{
		if(n1%i==0 && n2%i==0)
		{
			System.out.println(i);
			break;
		}
	}
	}
}
