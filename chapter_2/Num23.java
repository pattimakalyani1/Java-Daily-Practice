class Num
{
	public static void main(String [] args)
	{
	int n=10,count=0;	
	for(int i=1;i<=n;i++)
	{
		if(n==n*i)
		{
			count++;
		}
	}System.out.println(count==1?"prime":"not prime");
	}
}