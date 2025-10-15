import java.util.Scanner;
class JaggedArr
{
	public static void main(String [] args)
	{
		int [][] a=new int[][]{{1,5,3,2},{1,3,4},{4,}};
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

1 5 3 2
1 3 4
4

*/

//using scanner
class JaggedArr1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows:");
		int[][] ar=new int[sc.nextInt()][];
		for(int r=0;r<ar.length;r++)
		{
			System.out.println("no of columns:");
			ar[r]=new int[sc.nextInt()];
			for(int c=0;c<ar[r].length;c++)
			{
				ar[r][c]=sc.nextInt();
			}
		}
		System.out.println("jagged array:");
		for(int r=0;r<ar.length;r++)
		{
			
			for(int c=0;c<ar[r].length;c++)
			{
				System.out.print(ar[r][c]+" ");
			}
			System.out.println();
		}
	}
}


/*

enter no of rows:
4
no of columns:
3
1
2
3
no of columns:
5
6
4
2
4
5
no of columns:
2
3
4
no of columns:
1
3
jagged array:
1 2 3
6 4 2 4 5
3 4
3

*/			
		
		


