class TP23
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print("#"+" ");
			}
			System.out.println();
		}
	}
}



/*
# # # # #
# # # #
# # #
# #
#
*/


class TP231
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				if(c==rows||r==1||c==r)
				{
					System.out.print("#"+" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

