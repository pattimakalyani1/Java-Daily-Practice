class TP3
{
	public static void main(String [] args)
	{
	int rows=7;
	for(int r=1;r<=rows;r++)
	{	
		for(int c=rows;c>=r;c--)
		{
			System.out.print("#"+" ");
		}
		System.out.println();
	}
	}
}
			


/*
# # # # # # #
# # # # # #
# # # # #
# # # #
# # #
# #
#
*/