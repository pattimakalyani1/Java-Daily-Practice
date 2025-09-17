class Noarm
{
	public static void main(String [] args)
	{
		int x;
		for(x=1;x<=1000;x++)
		{
			int n=x,temp=n,sum=0,rem,count=0;
			while(n!=0)
			{
				count++;
				n/=10;
			}
			n=temp;
			while(n!=0)
			{
				rem=n%10;
				sum+=(int)Math.pow(rem,count);
				n/=10;
			}
			if(sum==temp)
			{
				System.out.println(temp);
			}
		}
	}
}
			