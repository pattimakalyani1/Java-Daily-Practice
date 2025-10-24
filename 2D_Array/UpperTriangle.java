class UpperTriangle
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
		System.out.println("Upper traingle matrix:");
		for(int x=0;x<=a.length-1;x++)
		{
			
			for(int y=0;y<=a.length-1;y++)
			{
				if(x>y)
					System.out.print("0"+" ");
				else
					System.out.print(a[x][y]+" ");	
			}
			System.out.println();		
		}
		System.out.println("Lower traingle matrix:");
		for(int x=0;x<=a.length-1;x++)
		{
			
			for(int y=0;y<=a.length-1;y++)
			{
				if(x<y)
					System.out.print("0"+" ");
				else
					System.out.print(a[x][y]+" ");	
			}
			System.out.println();		
		}

	}
}


/*

1 2 3
4 5 6
7 8 9
Upper traingle matrix:
1 2 3
0 5 6
0 0 9
Lower traingle matrix:
1 0 0
4 5 0
7 8 9


*/