class Dig
{
	public static void main(String [] args)
	{
		int n=576879,count=0,rem,rev;
		while(n!=0)
		{
			count++;
			rem=n%100;
			n=n/100;
			System.out.println(rem);
		}
		System.out.println("count:"+count);
	}
}