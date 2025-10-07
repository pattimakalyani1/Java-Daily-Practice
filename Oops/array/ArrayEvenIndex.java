import java.util.Scanner;	
class ArrayEvenIndex
{
	public static void main(String [] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("enter array number:");
		int x;
		for( x=0;x<=a.length-1;x++)
		a[x]=sc.nextInt();
		System.out.println("even idexes elements are:");
		for(x=0;x<=a.length-1;x++)
		{
			if(x%2==0)
			System.out.println(a[x]);
		}
	}
}

/*

enter array number:
12
34
23
56
234
even idexes elements are:
12
23
234

*/

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
