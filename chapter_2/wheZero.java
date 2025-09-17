class wheZero
{
	public static void main(String [] args)
	{
	int n=6076085,rem=0,sum=0;
	
		while(n!=0)
		{
			rem=n%10;
			if(rem==0)
			{
			  break;	
			}
		
			sum=sum+rem;
			n/=10;
		}
	System.out.println(sum);
}
}
