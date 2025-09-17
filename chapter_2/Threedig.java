class Threedig
{
	public static void main(String [] args)
	{
	int n=479,rem=0,rev=0,rev1=0,rem1=0;
	while(n!=0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n/=10;
	}
	
	while(rev!=0)
	{
		rem1=rev%10;
		if(rem1==9)
		{
			rem1=0;
			rev1=rev1*10+rem1;
		}
		else
		{
		rev1=rev1*10+rem1;
		rev1=rev1+1;
		}
		
		rev/=10;
		

	}System.out.println(rev1);
		
}
}