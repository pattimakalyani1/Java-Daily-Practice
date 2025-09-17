class Num2
{
	public static void main(String [] args)
	{
		int n=23456,rem=0,pro=0,count=0,temp=n,count1=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		n=temp;
		while(n!=0)
		{
			count1++;
			rem=n%10;
			n/=10;
			pro=n%10;
			if(count1<count)
			System.out.println(rem+"^"+pro+"="+(int)(Math.pow(rem,pro)));
			else
			System.out.println(rem+"^"+pro+"="+(int)(Math.pow(rem,rem)));
		}
	}
}

			
		