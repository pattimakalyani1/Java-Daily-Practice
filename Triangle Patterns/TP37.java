class TP37
{
	public static void main(String [] args)
	{
	int rows=5;
	for(int r=1;r<=rows;r++)
	{
		
		for(int c=r;c<rows;c++)
		{
			System.out.print("  ");
		}
		for(int c=1;c<=r;c++)
		{
			System.out.print("*"+"  ");
		}
		System.out.println();
	}
	}
}

/*

        *
      *  *
    *  *  *
  *  *  *  *
*  *  *  *  *

*/



class TP371
{
	public static void main(String [] args)
	{
	int rows=4,temp=3;
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=r;c++)
		{
			System.out.print(temp+" ");
			temp++;
		}	
		System.out.println();
	}
	}
}	

/*

3
4 5
6 7 8
9 10 11 12

*/


class TP372
{
	public static void main(String [] args)
	{
	int rows=5,count=0;
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=r;c++)
		{
			if(count%2!=0)
			{
				System.out.print("# ");
			}
			else
				System.out.print("* ");
			count++;
			
		}	
		System.out.println();
	}
	}
}	

/*

*
# *
# * #
* # * #
* # * # *

*/














		
