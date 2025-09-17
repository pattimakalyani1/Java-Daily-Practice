class Pal
{
	public static void main(String [] args)
	{
		int count=0,sum=0;
		for(int i=1;i<=100;i++)
		{
			int n=i,rev=0,temp=n;
			while(n!=0)
			{
				rev=rev*10+(n%10);
				n/=10;
			}
			if(temp==rev)
			{
			sum+=temp;
			count++;
			}	
		}
		System.out.println("count:"+count);
		System.out.println("sum:"+sum);

	}
}
				


		