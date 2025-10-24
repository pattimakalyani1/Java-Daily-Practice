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
		for(int r=0;r<=a.length-1;r++)//0<3//1<3//2<3
		{ 
			for(int c=0;c<=a[0].length-1-r;c++)//0<3-0 //0<3//1<3-0//1<3//2<3//3<3F //0<3-1//0<2//1<2//2<2F  //0<3-2//0<1//1<1f
			{
				System.out.print(a[r][c]+" ");//00//01//02  //10//11  //20
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


class MatrixlowTriangle
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
		System.out.println("LowerTraingle");
		for(int r=0;r<=a.length-1;r++)
		{ 
			for(int c=0;c<=a[0].length-1-r;c++)
			{
				System.out.print(a[r][c]+" ");			}
			System.out.println();
		}
	}
}
