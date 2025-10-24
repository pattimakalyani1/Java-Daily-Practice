class DiagonalSum
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
		System.out.println("diagonal sum");
		int sum=0,sum1=0;
		int n=a.length;
		for(int x=0;x<n;x++)
		{
			sum=sum+a[x][x];
			sum1=sum1+a[x][n-1-x]; 
		}
		System.out.println("sum:"+sum);
		System.out.println("sum1:"+sum1);

	}
}


/*

1 2 3
4 5 6
7 8 9
diagonal sum
sum:15
sum1:15

*/

				
