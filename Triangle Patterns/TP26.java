class TP26
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("# ");
			}
			for(int c=r;c<=rows;c++)
			{
				System.out.print("$ ");
			}
			System.out.println();
		}
	}
}


/*

# $ $ $ $ $
# # $ $ $ $
# # # $ $ $
# # # # $ $
# # # # # $

*/

class TP261
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				if(r==rows||c==1||r==c)
				{
					System.out.print("# ");
				}
				else
					System.out.print("  ");
			}
			for(int c=r;c<=rows;c++)
			{
				if(r==c||c==rows||r==1)
				{
					System.out.print("$ ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}


/*

# $ $ $ $ $
# # $     $
#   # $   $
#     # $ $
# # # # # $

*/



class TP262
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{	
			for(int c=r;c<=rows;c++)
			{
				System.out.print("# ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("$ ");
			}
			System.out.println();
		}
	}
}
					


/*

# # # # # $
# # # # $ $
# # # $ $ $
# # $ $ $ $
# $ $ $ $ $

*/

class TP263
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{	
			for(int c=r;c<=rows;c++)
			{
				if(r==1||r==c||c==rows)
				{
					System.out.print("# ");
				}
				else
					System.out.print("  ");
			}
			for(int c=1;c<=r;c++)
			{
				if(c==1||r==rows||r==c)
				{
				System.out.print("$ ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

/*
# # # # # $
#     # $ $
#   # $   $
# # $     $
# $ $ $ $ $


*/




























