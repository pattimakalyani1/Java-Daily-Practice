class TP35
{
	public static void main(String[] args)
	{
	int rows=4;
		for(int r=1;r<=rows;r++)
		{
			int temp=27,b=9;
			for(int c=r;c<=rows;c++)
			{
				System.out.print(temp+" ");
				temp-=b;
				b--;
			}
			System.out.println();
		}
	}
}


/*
27 18 10 3
27 18 10
27 18
27
*/