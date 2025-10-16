import java.util.Scanner;
class ArrMinMax
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int [] a=new int[5];
		System.out.println("enter array elements:");
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
		int min=a[0];
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]<min)
				min=a[x];
			
		}
		int max=a[0];
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]>max)
				max=a[x];
			
		}

		System.out.println("max of elements in a array: "+max);
		System.out.println("min of elements in a array: "+min);
	}
}


/*

enter array elements:
23
45
4
2
345
max of elements in a array: 345
min of elements in a array: 2

*/