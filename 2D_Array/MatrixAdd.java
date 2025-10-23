class MatrixAdd
{
	public static void main(String [] args)
	{
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int b[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int sum[][]=new int[a.length][a[0].length];	
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=a[0].length-1;y++)
			{
				sum[x][y]=a[x][y]+b[x][y];
			}
		}
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=a[0].length-1;y++)
			{
				System.out.print(sum[x][y]+" ");
			}System.out.println();
		}
	}
}
 