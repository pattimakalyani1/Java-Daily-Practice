class TP24
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("  ");
			}
			for(int c=r;c<=rows;c++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}	


/*(one space  is given at the starting)
 # # # # #
    # # # #
      # # #
        # #
          #
*/



class TP241
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<r;c++)
			{
				System.out.print("  ");
			}
			for(int c=r;c<=rows;c++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}	


/*(without space )
# # # # #
  # # # #
    # # #
      # #
        #
*/


class TP242
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
				System.out.print("# ");
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


class TP243
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<r;c++)
			{
				System.out.print("  ");
			}
			for(int c=r;c<=rows;c++)
			{
				System.out.print(" # ");
			}
			System.out.println();
		}
	}
}	


/*
#   #  #  #  #
   #  #  #  #
     #  #  #
       #  #
         #
*/
 

class TP244
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("  ");
			}
			for(int c=r;c<=rows;c++)
			{
				if(c==rows||r==1||c==r)
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

  # # # # #
    #     #
      #   #
        # #
          #

*/




