class Even
{
	public static void main(String [] args)
	{
		System.out.println("even numbers between 200 to 1");

		for(int i=99;i>1;i--)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("odd numbers between 200 to 1");
		for(int i=99;i>1;i--)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		System.out.println("even numbers between 200 to 400");


		for(int i=201;i<400;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("odd numbers between 200 to 400");
		for(int i=201;i<400;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}












	}
}
