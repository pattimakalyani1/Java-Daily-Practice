import java.util.Scanner;
class MatrixArr
{
	public static void main(String [] args)
	{
		int [][] a=new int[][]{{1,2},{1,3},{4,5}};
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
		
	}
}



/*

1 2
1 3
4 5

*/

class MatrixArr1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values:");
		int [][] a=new int[3][3];
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				a[r][c]=sc.nextInt();
			}
			
		}

		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
	}
}


/*


enter values:
2
3
4
4
5
6
7
8
9
2 3 4
4 5 6
7 8 9


*/

class MatrixArr2
{
	public static void main(String [] args)
	{
		int [][] a=new int[][]{{1,2},{1,3},{4,5}};
		int sum1=0;
		System.out.println("arr:");
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
				sum1=sum1+a[r][c];			}
			System.out.println();
		}
		System.out.println("sum of all elements in a array:"+sum1);
		for(int r=0;r<a.length;r++)
		{
			int sum=0;
			for(int c=0;c<a[r].length;c++)
			{
				sum=sum+a[r][c];
			}
			System.out.println("sum of elements in "+r+" row:"+sum);
		}

		
	}
}


/*

arr:
1 2
1 3
4 5
sum of all elements in a array:16
sum of elements in 0 row:3
sum of elements in 1 row:4
sum of elements in 2 row:9

*/


class MatrixArr3
{
	public static void main(String [] args)
	{
		int [][] a=new int[][]{{1,2},{1,3},{4,5}};
		int pro1=1;
		System.out.println("arr:");
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
				pro1*=a[r][c];			}
			System.out.println();
		}
		System.out.println("product of all elements in a array:"+pro1);
		for(int r=0;r<a.length;r++)
		{
			int pro=1;
			for(int c=0;c<a[r].length;c++)
			{
				pro*=a[r][c];
			}
			System.out.println("product of elements in "+r+" row:"+pro);
		}

		
	}
}


/*

arr:
1 2
1 3
4 5
product of all elements in a array:120
product of elements in 0 row:2
product of elements in 1 row:3
product of elements in 2 row:20

*/

//finding max element:
class MatrixArr4
{
	public static void main(String [] args)
	{
		int [][] a=new int[][]{{1,2},{1,3},{4,5}};
		System.out.println("arr:");
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
		int max=a[0][0];
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				if(a[r][c]>max)
					max=a[r][c];
			}
		}
		System.out.println("max element in a : "+max);

		for(int r=0;r<a.length;r++)
		{
			int max1=a[0][0];
			for(int c=0;c<a[r].length;c++)
			{
				if(a[r][c]>max1)
					max1=a[r][c];
			}
			System.out.println("max  element in "+r+" row:"+max1);
		}

		
	}
}

/*

arr:
1 2
1 3
4 5
max element in a : 5
max  element in 0 row:2
max  element in 1 row:3
max  element in 2 row:5

*/

class MatrixArr5
{
	public static void main(String [] args)
	{
		int [][] a=new int[][]{{1,2},{1,3},{4,5}};
		System.out.println("arr:");
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
		int min=a[0][0];
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				if(a[r][c]<min)
					min=a[r][c];
			}
		}
		System.out.println("min element in a : "+min);

		for(int r=0;r<a.length;r++)
		{
			int min1=a[0][0];
			for(int c=0;c<a[r].length;c++)
			{
				if(a[r][c]<min1)
					min1=a[r][c];
			}
			System.out.println("min  element in "+r+" row:"+min1);
		}

		
	}
}


/*

arr:
1 2
1 3
4 5
min element in a : 1
min  element in 0 row:1
min  element in 1 row:1
min  element in 2 row:1

*/


class MatrixArr6
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values:");
		int [][] a=new int[3][3];
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				a[r][c]=sc.nextInt();
			}
			
		}

		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
	}
}


/*

enter values:
1
2
3
4
5
6
7
8
9
1 2 3
4 5 6
7 8 9

*/


class MatrixArr7
{
	public static void main(String [] args)
	{
		int [][] a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				if((r+c)%2==0)
					System.out.print(a[r][c]+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
}

/*

1   3
  5
7   9

*/


class MatrixArr8
{
	public static void main(String [] args)
	{
		int [][] a=new int[][]{{1,2,3},{4,5,6}};
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
		int x=a.length;
		int y=a[0].length;
		System.out.println("transpose array:");
		for(int r=0;r<y;r++)
		{
				for(int c=0;c<x;c++)
				{	
					System.out.print(a[c][r]+" ");	
				}
				System.out.println();
		}
	}
}

/*

1 2 3
4 5 6
transpose array:
1 4
2 5
3 6

*/



































