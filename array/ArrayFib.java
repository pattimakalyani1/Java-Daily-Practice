import java.util.Scanner;	
class ArrayFib
{
	public static void main(String [] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("enter array number:");
		for(int x=0;x<=a.length-1;x++)
		a[x]=sc.nextInt();
		for(int y=0;y<=a.length-1;y++)
		{
			int f=0,s=1,t;
			System.out.print(a[y]+":");
			System.out.print(f+" ");
			System.out.print(s+" ");
			int number=a[y];
			for(int x=0;x<number-2;x++)
			{
				t=f+s;
				s=t;
				f=s;
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}
}


/*

enter array number:
4
5
3
5
4
4:0 1 1 2
5:0 1 1 2 4
3:0 1 1
5:0 1 1 2 4
4:0 1 1 2

*/