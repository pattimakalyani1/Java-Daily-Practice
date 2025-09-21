class TP39
{
	public static void main(String [] args)
	{
		int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=2*r-1;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		int rows1=3;
		for(int r=1;r<=rows1;r++)
		{
			for(int c=1;c<=r+1;c++)
			{
				System.out.print(" ");
			}
			for(int c=r;c<=rows1;c++)
			{
				System.out.print("*");
			}
			for(int c=r;c<=rows1-1;c++)
			{
				System.out.print("*");
			}
						
			System.out.println();
		}

	}
}


/*

    *
   ***
  *****
 *******
  *****
   ***
    *

*/



class TP391
{
	public static void main(String [] args)
	{
	int n=9;
	int  rows=(n/2)+1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		int rows1=rows-1;
		for(int r=1;r<=rows1;r++)
		{
			for(int c=1;c<=r+1;c++)
			{
				System.out.print(" ");
			}
			for(int c=r;c<=rows1;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		} 
	}
}
	

/*

     *
    **
   ***
  ****
 *****
  ****
   ***
    **
     *

*/		


class TP392
{
	public static void main(String [] args)
	{
	int n=3;
	int  rows=n;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print("  ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("  * ");
			}
			System.out.println();
		}
		int rows1=rows-1;
		for(int r=1;r<=rows1;r++)
		{
			for(int c=1;c<=r+1;c++)
			{
				System.out.print("  ");
			}
			for(int c=r;c<=rows1;c++)
			{
				System.out.print("  * ");
			}
			System.out.println();
		} 
	}
}




































































