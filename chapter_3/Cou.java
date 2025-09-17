class Cou
{
	public static void main(String [] args)
	{
		int n=135643552,rem=0,count=0,temp=n;
		for(int i=0;i<=9;i++)
		{
			temp=n;
			count=0;
			while(temp!=0) 
			{
			rem=temp%10;
			if(rem==i)
			count++;
			
			temp/=10;
			}
		if(count==0)
		System.out.println(i);
		
		}
	}
}