class Prime
{
	public static void main(String [] args)
	{
		int x,num=11,count=0;
		for(x=2;x<=num/2;x++)
		{ 
			if(num%x==0)
			{
				count++;
			System.out.println("not a prime");
			break;	
			}
		}
		if(count==0)
		System.out.println("prime number");
		
	}
}