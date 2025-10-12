import java.util.Scanner;
class ArrayEvenEle
{
	public static void main(String [] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("enter array number:");
		int x,count=0;;
		for( x=0;x<=a.length-1;x++)
		a[x]=sc.nextInt();
		System.out.println("even elements are:");
		for(x=0;x<=a.length-1;x++)
		{
			if(a[x]%2==0)
			{
				System.out.println(a[x]);
				count++;
			}
		}System.out.println("no of even:"+count);
	}
}



/*

2
43
56
75
45
even elements are:
2
56
no of even:2

*/