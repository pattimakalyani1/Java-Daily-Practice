class Nu
{
	public static void main(String [] args)
	{
		int n=235;
		int pro=1,rem=0;
		while(n!=0 && !(n%2==0 || (n>1 && n<10)))
		{
			while(n!=0)
			{
				rem=n%10;//5
				pro=pro*rem;//5
				n/=10;
			}
			n=pro/2;
		}System.out.println(n);

		
	}
}
		