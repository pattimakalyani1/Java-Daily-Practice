class SumRowCol
{
	public static void main(String [] args)
	{
		int [][]a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int x=0;x<=a.length-1'x++)
		{
			int sum=0;
			for(int y=0;y<=a[0].length-1;y++)
			{
				sum=sum+a[y][x];
			}
			System.out.println(sum);
		}
	}
}
			