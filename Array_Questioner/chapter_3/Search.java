import java.util.Scanner;
class Search
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int [] a=new int[10];
		System.out.println("enter array elements:");
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
		/*for(int x=0;x<=a.length-1;x++)
		{
			System.out.print(a[x]+" ");
		}*/
		System.out.println("enter searching element:");
		int search=sc.nextInt();
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]==search)
			{
				System.out.println("element is found:"+x+" index or "+(x+1)+" position");
				break;
			}
		}

	}
}
			
/*

enter array elements:
23
34
56
43
23
56
78
65
45
67
enter searching element:
67
element is found:9index or 10position

*/


class Search1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int [] a=new int[10];
		boolean b=false;
		int count=0;
		System.out.println("enter array elements:");
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
		/*for(int x=0;x<=a.length-1;x++)
		{
			System.out.print(a[x]+" ");
		}*/
		System.out.println("enter searching element:");
		int search=sc.nextInt();
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]==search)
			{
				b=true;
				count++;
			}
		}
		if(b)
			System.out.println("element is found "+count+"times");
		else
			System.out.println("element is not found");
	}
}

/*

enter array elements:
23
34
54
23
45
67
76
765
56
56
enter searching element:
56
element is found 2times

*/
				