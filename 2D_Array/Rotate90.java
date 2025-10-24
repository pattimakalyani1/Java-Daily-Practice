class Rotate90
{
	public static void main(String [] args)
	{
		int [][]a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		for(int x=0;x<=a.length-1;x++)
		{
			
			for(int y=0;y<=a[0].length-1;y++)
			{
				System.out.print(a[x][y]+" ");
				
			}
			System.out.println();		
		}
		System.out.println("90 degree:");
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=a[0].length-1;y>=0;y--)
			{
				System.out.print(a[y][x]+" ");
			}
			System.out.println();
		}
	}
}


/*


1 2 3
4 5 6
7 8 9
90 degree:
7 4 1
8 5 2
9 6 3



*/