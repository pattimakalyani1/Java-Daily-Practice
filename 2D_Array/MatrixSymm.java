class MatrixSymm
{
	public static void main(String[] args)
	{
		int a[][]=new int[][]{{1,2,3},{2,3,4},{3,4,5}};
		int b[][]=new int[a.length][a[0].length];
		int count=0;
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=a[0].length-1;y++)
			{
				b[x][y]=a[y][x];
			}
		}
		System.out.println("A array:");
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=a[0].length-1;y++)
			{
				System.out.print(a[x][y]+" ");
			}
			System.out.println();
		}

		System.out.println("b array:");

		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=a[0].length-1;y++)
			{
				System.out.print(b[x][y]+" ");
			}
			System.out.println();
		}
		
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=a[0].length-1;y++)
			{
				if(a[x][y]==b[x][y])
				{
					count++;
				}
			}
		}
		int n=(a.length*a[0].length);
		System.out.println(count==n?"Symmetric":"not symmetric");


	}
}


/*


A array:
1 2 3
2 3 4
3 4 5
b array:
1 2 3
2 3 4
3 4 5
Symmetric


*/

/*	

A array:
1 2 3
2 3 4
7 4 5
b array:
1 2 7
2 3 4
3 4 5
not symmetric	

*/	



//or


class MatrixSymm1
{
	public static void main(String[] args)
	{
		int a[][]=new int[][]{{1,2,3},{2,3,4},{3,4,5}};
		int count=0;
		boolean b=true;
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=a[0].length-1;y++)
			{
				System.out.print(a[y][x]+" ");
			}System.out.println();
		}
		System.out.println("A array:");
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=a[0].length-1;y++)
			{
				if(a[x][y]!=a[y][x])
					b=false;
			}

		}
		System.out.println(b?"symm":"not symm");
	}
}

/*

1 2 3
2 3 4
3 4 5
A array:
symm


*/
	