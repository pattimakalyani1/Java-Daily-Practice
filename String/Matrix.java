import java.util.Scanner;
import java.util.Arrays;
class Matrix
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter no of rows and cols:");
		String a[][]=new String[sc.nextInt()][sc.nextInt()];
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=a[0].length-1;y++)
			{
				a[x][y]=sc.next();
			}
		}
		System.out.println("matrix is:");
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=a[0].length-1;y++)
			{
				System.out.print(a[x][y]+" ");
			}
			System.out.println();
		}
		String search="starter";
		int x=0,y=0;
		for(x=0;x<a.length;x++)
		{
			for(y=0;y<a[0].length;y++)
			{
				if(a[x][y].equals(search))
					
			}
		}
		System.out.println(a[x][y]);


	}
}
				
				