class Nopalin
{
	public static void main(String [] args)
	{
		int x,count=0,sum=0; 
		for(x=1;x<=1000;x++)
		{
			int n=x,rev=0,temp=n;
			while(n!=0)
			{
				rev=rev*10+(n%10);
				n/=10;
			}
			if(temp==rev)
			{
				count++;
				sum+=temp;
				System.out.println(temp);
			}
		}System.out.println("no of palindromes from 1 to 1000 is "+count);
		System.out.println("sum of palindromes from 1 to 1000 is "+sum);
	}
}

	