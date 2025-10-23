class MatrixIndentity
{
	public static void main(String[] args)
	{
		int a[][]=new int[][]{{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
		int count=0;
		for(int x=0;x<=a.length-1;x++)		
		{
			for(int y=0;y<=a[0].length-1;y++)
			{
				 
				if(a[x][y]!=1)
				{
					count++;
					
				}
			}
			
		}
		
		int n=(a.length*a[0].length);
		int m=n-a[0].length;
		System.out.println(count==m?"identity matrix":"not a identity matrix");
	}
}
	

/*

Identity marix

*/