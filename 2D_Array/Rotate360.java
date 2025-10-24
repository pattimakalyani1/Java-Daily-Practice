class Rotate360
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
		int r=2;
		System.out.println("360 degree:");
		for(int k=0;k<r;k++)
		{
			int temp[][]=new int[a.length][a[0].length];

			for(int x=0;x<=a.length-1;x++)
			{
				for(int y=a[0].length-1;y>=0;y--)
				{
					temp[y][x]=a[x][y];
				}	
			
			}
			a=temp;
		}
		for(int x=0;x<=a.length-1;x++)
		{
			
			for(int y=0;y<=a[0].length-1;y++)
			{
				System.out.print(temp[x][y]+" ");
				
			}
			System.out.println();		
		}

		
	}
}
