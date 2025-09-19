class TP4
{
	public static void main(String [] args)
	{
	int rows=5;
	for(int r=1;r<=rows;r++)
	{	
		for(int c=rows;c>=r;c--)
		{
			if(r==1||c==rows||r==c)
			{
				System.out.print("#"+" ");
			}
			else
			{
				System.out.print("  ");
			}
			
			
		}System.out.println();
	}
	}
}

/*
# # # # #
#     #
#   #
# #
#
*/
