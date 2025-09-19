class TP11
{
	public static void main(String [] args)
	{
	int rows=3;
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=r;c++)
		{
			if(r==c)
			{
				System.out.print("1"+" ");
			}
			else
			{
				System.out.print("0"+" ");
			}
		}
		System.out.println();
	}
	int rows1=2;
	for(int r=1;r<=rows1;r++)
	{

		for(int c=r;c<=rows1;c++)
		{
			if(r==1&& c==1)
			{
				System.out.print("0"+" ");
			}
			else
			System.out.print("1"+" ");
		}
		System.out.println();
	}

	}
}



/*
1
0 1
0 0 1
0 1
1
*/