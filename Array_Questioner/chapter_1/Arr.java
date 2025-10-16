class Arr
{
	public static void main(String [] args)
	{
		int a[]=new int[]{139,12,34,5,566,7};
		char c[]=new char[]{'c','3','(','?'};
		String s[]=new String[]{"hello","all","good","morning","453","?<>|+_"};
		boolean b[]=new boolean[]{true,false,true,false,true,true};
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		System.out.println(a.length);
		for(char temp:c)
			System.out.print(temp+" ");
		System.out.println();
		System.out.println(c.length);
		for(boolean temp:b)
			System.out.print(temp+" ");
		System.out.println();
		System.out.println(b.length);
		for(String temp:s)
			System.out.print(temp+" ");
		System.out.println();
		System.out.println(s.length);


	}
}

/*
139 12 34 5 566 7
6
c 3 ( ?
4
true false true false true true
6
hello all good morning 453 ?<>|+_
6
*/


//finding length without using length
class Arr1
{
	public static void main(String [] args)
	{
		int a[]=new int[]{139,12,34,5,566,7};
		char c[]=new char[]{'c','3','(','?'};
		String s[]=new String[]{"hello","all","good","morning","453","?<>|+_"};
		boolean b[]=new boolean[]{true,false,true,false,true,true};
		int counta=0,countb=0,counts=0,countc=0;
		for(int temp:a)
		{
			counta++;
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println(counta);
		for(char temp:c)
		{	
			countc++;
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println(countc);
		for(boolean temp:b)
		{
			countb++;
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println(b.length);
		for(String temp:s)
		{
			counts++;
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println(counts);


	}
}

/*

139 12 34 5 566 7
6
c 3 ( ?
4
true false true false true true
6
hello all good morning 453 ?<>|+_
6
*/


class Arr5a
{
	public static void main(String [] args)
	{
		int a[]=new int[]{12,56,34,23,67,76,32,75,90,345};
		for(int x=a.length-1;x>=0;x--)
		{
			System.out.print(a[x]+" ");
		}
	}
}

/*

345 90 75 32 76 67 23 34 56 12

*/

class Arr5b
{
	public static void main(String [] args)
	{
		int a[]=new int[]{12,56,34,23,67,76,32,75,90,345};
		System.out.println("array:");
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		System.out.println("first half is same and second half is reversed:");
		int y=(a.length)/2;
		for(int x=0;x<y;x++)
		{
			System.out.print(a[x]+" ");
		}
		for(int x=a.length-1;x>=y;x--)
			System.out.print(a[x]+" ");
		System.out.println();
		System.out.println("first half is reverse and second half is same:");
		for(int x=y-1;x>=0;x--)
		{
			System.out.print(a[x]+" ");
		}
		for(int x=y;x<=a.length-1;x++)
			System.out.print(a[x]+" ");
	}
}

/*

array:
12 56 34 23 67 76 32 75 90 345
first half is same and second half is reversed:
12 56 34 23 67 345 90 75 32 76
first half is reverse and second half is same:
67 23 34 56 12 76 32 75 90 345

*/

class Arr5c
{
	public static void main(String [] args)
	{
		int a[]=new int[]{12,56,34,23,67,76,32,75,90,345};
		System.out.println("array:");
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		System.out.println("even indexed elements:");
		for(int x=0;x<=a.length-1;x++)
		{
			if(x%2==0)
				System.out.print(a[x]+" ");
		}
		System.out.println();
		System.out.println("odd indexed elements:");
		for(int x=0;x<=a.length-1;x++)
		{
			if(x%2!=0)
				System.out.print(a[x]+" ");
		}
		System.out.println();
		System.out.println("elements divisible by 4:");
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]%4==0)
				System.out.print(a[x]+" ");
		}
		System.out.println();
		System.out.println("indices divisible by 3");
		for(int x=0;x<=a.length-1;x++)
		{
			if(x%3==0)
				System.out.print(a[x]+" ");
		}
		System.out.println();



	}
}

/*

array:
12 56 34 23 67 76 32 75 90 345
even indexed elements:
12 34 67 32 90
odd indexed elements:
56 23 76 75 345
elements divisible by 4:
12 56 76 32
indices divisible by 3
12 23 32 345

*/


class Arr7
{
	public static void main(String [] args)
	{
		int a[]=new int[]{12,56,34,23,67,76,32,75,90,345};
		System.out.println("array:");
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		for(int x=0;x<a.length-1;x++)
		{
			int min=x,temp;
			for(int y=x+1;y<a.length-1;y++)
			{
				if(a[min]>a[y])
				{
					min=y;
				}
			}
			temp=a[min];
			a[min]=a[x];
			a[x]=temp;
		}
		System.out.println("sorted array in ascending order:");
		for(int temp:a)
			System.out.print(temp+" ");
		int b[]=new int[]{12,56,34,23,67,76,32,75,90,345};
		for(int x=0;x<b.length-1;x++)
		{
			int min=0,temp1;
			for(int y=1;y<=b.length-1;y++)
			{
				if(b[min]<b[y])
				{
					min=y;
				}
			}
			temp1=b[min];
			b[min]=b[0];
			b[0]=temp1;
		}
		System.out.println();
		System.out.println("sorted array in descending order:");
		for(int temp:b)
			System.out.print(temp+" ");
	}
}	

/*

array:
12 56 34 23 67 76 32 75 90 345
sorted array in ascending order:
12 23 32 34 56 67 75 76 90 345
sorted array in descending order:
345 56 34 23 67 76 32 75 90 12

*/

class Arr8
{
	public static void main(String [] args)
	{
		int a[]=new int[]{12,56,34,23,67,76,32,75,90,345};
		System.out.println("array:");
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		int mid=(a.length-1)/2;
		for(int x=0;x<mid;x++)
		{
			int min=x,temp;
			for(int y=x+1;y<mid;y++)
			{
				if(a[min]>a[y])
				{
					min=y;
				}
			}
			temp=a[min];
			a[min]=a[x];
			a[x]=temp;
		}
		for(int x=mid;x<a.length-1;x++)
		{
			int min=x,temp;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[min]<a[y])
				{
					min=y;
				}
			}
			temp=a[min];
			a[min]=a[x];
			a[x]=temp;
		}
		
		System.out.println("sorted  first half array in ascending order and second half in descending order:");
		for(int temp:a)
			System.out.print(temp+" ");
	}
}

/*

array:
12 56 34 23 67 76 32 75 90 345
sorted  first half array in ascending order and second half in descending order:
12 23 34 56 345 90 76 75 67 32

*/


class Arr9
{
	public static void main(String [] args)
	{
		int a[]=new int[]{12,56,34,23,67,76,32,75,90,345};
		System.out.println("array:");
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		int mid=(a.length-1)/2;
		for(int x=0;x<mid;x++)
		{
			int min=x,temp;
			for(int y=x+1;y<mid;y++)
			{
				if(x%2!=0)
				{
				if(a[min]>a[y])
				{
					min=y;
				}
			}
			temp=a[min];
			a[min]=a[x];
			a[x]=temp;
		}
		for(int x=mid;x<a.length-1;x++)
		{
			int min=x,temp;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[min]<a[y])
				{
					min=y;
				}
			}
			temp=a[min];
			a[min]=a[x];
			a[x]=temp;
		}
		
		System.out.println("sorted  first half array in ascending order and second half in descending order:");
		for(int temp:a)
			System.out.print(temp+" ");
	}
}





