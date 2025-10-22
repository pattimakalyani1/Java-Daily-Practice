class AddSub
{
	public static void main(String [] args)
	{
	int a[][]=new int[][]{{1,2,3},{3,4,5}};
	int b[][]=new int[][]{{1,2,3},{3,4,5}};
	int row=a.length;
	int col=a[0].length;
	int sum[][]=new int [row][col];
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
			sum[x][y]=a[x][y]+b[x][y];
		}
	}
	
	System.out.println("sum of a and b array:");
	for(int x=0;x<row;x++)
	{
		for(int y=0;y<col;y++)
		{
			System.out.print(sum[x][y]+" ");
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
sum of a and b array:
2 4 6
6 8 10


*/