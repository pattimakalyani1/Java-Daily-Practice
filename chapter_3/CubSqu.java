class CubSqu
{
	public static void main(String [] args)
	{
	int n=10,c=0,d=0;
	System.out.println("squares of numbers");
	for(int i=1;i<=n;i++)
	{
		 c=(int)(Math.pow(i,2));
		System.out.println(c);
	}
	System.out.println("cubes of numbers");
	for(int i=1;i<=n;i++)
	{
		 d=(int)(Math.pow(i,3));
		System.out.println(d);
	}
	}
}
		