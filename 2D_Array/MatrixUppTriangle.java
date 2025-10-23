class MatrixUppTriangle
{
	public static void main(String[] args)
	{
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=a[0].length-1;y++)
			{
				System.out.print(a[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println("upperTraingle");
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[0].length-1-r;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
	}
}


/*

1 2 3
4 5 6
7 8 9
upperTraingle
1 2 3
4 5
7

*/
