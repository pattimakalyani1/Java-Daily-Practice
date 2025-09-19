class TP14
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
	int rows1=4;
	for(int r=1;r<=rows1;r++)
	{
		for(int c=1;c<=r+1;c++)
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
# #
# # #
# # # #
# # # # #
*/		