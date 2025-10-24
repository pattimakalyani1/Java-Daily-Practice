class BoundaryMatrix
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
		System.out.println("boundary matrix:");
		for(int x=0;x<=a.length-1;x++)
		{
			
			for(int y=0;y<=a[0].length-1;y++)
			{
				if(x==0||y==0||x==a.length-1||y==a.length-1)
					System.out.print(a[x][y]+" ");
				else
					System.out.print("  ");
				
			}
			System.out.println();		
		}
	}
}


/*


1 2 3
4 5 6
7 8 9
boundary matrix:
1 2 3
4   6
7 8 9


*/