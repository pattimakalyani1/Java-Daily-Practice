import java.util.Scanner;
class RightRota
{
	public static void main(String [] args)
	{
		int [] a=new int[]{10,20,30,40,50,60,70};
		System.out.println("Original Array:");
		for(int temp:a)
			System.out.print(temp+" ");
		int r=2,x;
		for(int y=1;y<=r;y++)
		{
			int copy=a[a.length-1];
			for(x=a.length-1;x>0;x--)
				a[x]=a[x-1];
			a[0]=copy;
		}
		System.out.println();
		System.out.println("right rotation:");
		for(int temp:a)
			System.out.print(temp+" ");
	}                         nnnbb          
}

/*

Original Array:
10 20 30 40 50 60 70
right rotation:
60 70 10 20 30 40 50

*/