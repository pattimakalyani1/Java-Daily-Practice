class TP36
{
	public static void main(String[] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			int temp=1;
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

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/


class TP361
{
	public static void main(String[] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			int temp=5;
			for(int c=r;c<=rows;c++)
			{
				System.out.print(temp+" ");
				temp--;
				
			}
			System.out.println();
		}
	}
}

/*

5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

*/


class TP362
{
	public static void main(String[] args)
	{
	int rows=4,temp=1;
		for(int r=1;r<=rows;r++)
		{
			
			for(int c=r;c<=rows;c++)
			{
				System.out.print("  ");
				
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print(temp+"   ");
				temp++;
			}
			System.out.println();
		}
	}
}



/*

        1
      2   3
    4   5   6
  7   8   9   10

*/



class TP363
{
	public static void main(String[] args)
	{
	int rows=3;
		for(int r=1;r<=rows;r++)
		{
			int temp=1;
			for(int c=1;c<=r;c++)
			{
				System.out.print(temp*3+" ");
				temp++;
			}
			System.out.println();
		}
	}
}	


/*

3
3 6
3 6 9

*/


class TP364
{
	public static void main(String[] args)
	{
	int rows=3,temp=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(temp+" ");
				
			}
			System.out.println();
			temp++;
		}
	}
}	


/*

1
2 2
3 3 3

*/






















