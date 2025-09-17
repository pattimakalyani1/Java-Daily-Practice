class Lcom
{
	public static void main(String [] args)
	{
	int n1=3,n2=2,res=0,count=0;
	res=n1>n2?n2:n1;
	for(int i=2;i<=res;i++)
	{
		if(n1%i==0 && n2%i==0)
		{  
			count++;
			System.out.println(i);
			break;
		}
	}
	if(count==0)
	System.out.println("no least commmon factor");
	}
}
