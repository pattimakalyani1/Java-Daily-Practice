class TP2
{
	public static void main(String [] args)
	{
	int rows=7;
	for(int r=1;r<=rows;r++)
	{	
		for(int c=1;c<=r;c++)
		{
			if(r==c||c==1||r==rows)
			{
				System.out.print("#"+" ");
			}
			else
			{
				System.out.print("$"+" ");
			}
		}
		System.out.println();
	}
	}
}


/*
#
# #
# $ #
# $ $ #
# $ $ $ #
# $ $ $ $ #
# # # # # # #
*/