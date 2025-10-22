class Mul
{
	public static void main(String [] args)
	{
	int a[][]=new int[][]{{1,2,3},{3,4,5}};
	int b[][]=new int[][]{{1,2,3},{3,4,5}};
	int row=a.length;
	int col=a[0].length;
	int mul[][]=new int [row][col];
	System.out.println("a array:");
	for(int x=0;x<row;x++)
	{
		for(int y=0;y<col;y++)
		{
			System.out.print(a[x][y]+" ");
		}
		System.out.println();
	}
	
	System.out.println("b array:");

	for(int x=0;x<row;x++)
	{
		for(int y=0;y<col;y++)
		{
			System.out.print(b[x][y]+" ");
		}
		System.out.println();
	}


	for(int x=0;x<row;x++)
	{
		for(int y=0;y<col;y++)
		{
			mul[x][y]=a[x][y]*b[x][y];
		}
	}
	
	System.out.println("multiplication of a and b array:");
	for(int x=0;x<row;x++)
	{
		for(int y=0;y<col;y++)
		{
			System.out.print(mul[x][y]+" ");
		}
		System.out.println();
	}
	}
}

/*


a array:
1 2 3
3 4 5
b array:
1 2 3
3 4 5
multiplication of a and b array:
1 4 9
9 16 25


*/
