class TP25
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("#");
			}
			System.out.println();

		}
	}
}


/*
     #
    ##
   ###
  ####
 #####

*/


class TP251
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("# ");
			}
			System.out.println();

		}
	}
}


/*
     #
    # #
   # # #
  # # # #
 # # # # #

*/


class TP252
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				if(c==1||c==r||r==rows)
				{
					System.out.print("#");
				}
				else
					System.out.print(" ");
			}
			System.out.println();

		}
	}
}


/*
     #
    ##
   # #
  #  #
 #####
*/


class TP253
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				if(c==1||c==r||r==rows)
				{
					System.out.print("# ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();

		}
	}
}

/*
     #
    # #
   #   #
  #     #
 # # # # #

*/






























