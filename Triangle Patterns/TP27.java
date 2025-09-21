class TP27
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
			for(int c=1;c<=r;c++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}
}


/*
     ##
    ####
   ######
  ########
 ##########



*/


class TP271
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
				if(c==1||r==rows)
				{
					System.out.print("#");
				}
				else
					System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				if(r==c||r==rows)
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

     ##
    #  #
   #    #
  #      #
 ##########


*/

//writing two for loops into single for loop

class TP272
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
			for(int c=1;c<2*r;c++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
			
/*

     #
    ###
   #####
  #######
 #########

*/


class TP273
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
			for(int c=1;c<r;c++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}
}

/*
     #
    ###
   #####
  #######
 #########

*/


class TP274
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
				if(c==1||r==rows)
				{
					System.out.print("#");
				}
				else
					System.out.print(" ");
			}
			for(int c=1;c<r;c++)
			{
				if(r-1==c||r==rows)
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
    # #
   #   #
  #     #
 #########


*/

class TP275
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(" ");
			}
			for(int c=r;c<=rows;c++)
			{
				System.out.print("#");
			}
			for(int c=r;c<=rows;c++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}
}


/*
 ##########
  ########
   ######
    ####
     ##
*/


class TP276
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<r;c++)
			{
				System.out.print(" ");
			}
			for(int c=r;c<=rows;c++)
			{
				if(r==1||r==c)
				{
				System.out.print("# ");
				}
				else
					System.out.print(" ");
			}
			for(int c=r;c<=rows;c++)
			{
				if(r==1||c==rows)
				{
					System.out.print("# ");
				}
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}

/*

# # # # # # # # # #
 #             #
  #         #
   #     #
    # #

*/























		