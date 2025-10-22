class Transpose
{
	public static void main(String [] args)
	{
		int a[][]=new int[][]{{1,2,3},{3,4,5},{6,7,8}};
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=a[0].length-1;y++)
			{
				System.out.print(a[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println("transpose matrix:");
		
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=a[0].length-1;y++)
			{
				System.out.print(a[y][x]+" ");
			}
			System.out.println();
		}
	}
}


/*

1 2 3
3 4 5
6 7 8
transpose matrix:
1 3 6
2 4 7
3 5 8

*/		