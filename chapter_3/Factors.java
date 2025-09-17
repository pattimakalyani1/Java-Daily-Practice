class Factors
{
	public static void main(String [] args)
	{
		int x;
		for(x=1;x<=10;x++)
		{
			System.out.print(x+"-->");
			int y,num=x;
			for(y=1;y<=num;y++)
			{
				if(x%y==0)
				{
					System.out.print(y+" ");
				}
			}System.out.println();
		}
	}
}
			