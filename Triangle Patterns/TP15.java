class TP15
{
	public static void main(String [] args)
	{
	int rows=5;
	for(int r=1;r<=rows;r++)
	{
		for(int c=r;c<=rows;c++)
		{
			if(c==r||r==1||c==rows)
			{
				System.out.print("#"+" ");
			}
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	int rows1=4;
	for(int r=1;r<=rows1;r++)
	{
		for(int c=1;c<=r+1;c++)
		{
			if(c==1||r==rows1||r==c-1)
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


/*
# # # # #
#     #
#   #
# #
#
# #
#   #
#     #
# # # # #

*/