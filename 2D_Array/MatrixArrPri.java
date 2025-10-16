class MatrixArrPri
{
	public static void main(String [] args)
	{
		int [][] a=new int[][]{{1,2,3},{4,5,6}};
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{ 
				int count=0;
				for(int i=2;i<=a[r][c]/2;i++)
				{
					if(a[r][c]%i==0 )
					{
						count++;
						break;
					}
				}
				if(count==0 && a[r][c]!=1)
					System.out.println(a[r][c]);
			}
		}
	}
}


/*

2
3
5

*/