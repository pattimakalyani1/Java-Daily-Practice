class SumRowCol
{
	public static void main(String [] args)
	{
		int [][]a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int sum=0,sum1=0;
		System.out.print("sumof each row:");
		for(int x=0;x<=a.length-1;x++)
		{
			sum=0;sum1=0;
			for(int y=0;y<=a[0].length-1;y++)
			{
				sum1=sum1+a[x][y];
				
			}
			System.out.print(sum1+" ");
			
		}
		System.out.println();
		System.out.print("sumof each column:");

		for(int x=0;x<=a.length-1;x++)
		{
			sum=0;sum1=0;
			for(int y=0;y<=a[0].length-1;y++)
			{
				sum=sum+a[y][x];
			}
			System.out.print(sum+" ");
		}
	}
}
	
/*

sumof each row:6 15 24
sumof each column:12 15 18

*/
		