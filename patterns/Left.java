import java.util.*;
class Left
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,20,30,40,50,60,70,80,90};
		for(int temp:a)
			System.out.print(temp+" ");
		int r=2;
		for(int y=0;y<=r-1;y++)
		{
			int copy=a[0];
			for(int x=0;x<a.length-1;x++)
			{
				a[x]=a[x+1];
			}
			a[a.length-1]=copy;
		}
		System.out.println();
		System.out.println("left");
		for(int temp:a)
			System.out.print(temp+" ");
	}
}


class Right
{
	public static void main(String [] args)
	{
		int a[]=new int[]{12,20,30,40,50,60,70,80,90};
		for(int temp:a)
			System.out.print(temp+" ");
		int copy=a[a.length-1];

		for(int x=a.length-1;x>0;x--)
		{
			a[x]=a[x-1];
		}
		a[0]=copy;
		System.out.println();
		System.out.println("right");
		for(int temp:a)
			System.out.print(temp+" ");
	}
}


class LinearSearch
{
	public static void main(String [] args)
	{
		int a[]=new int[]{12,20,30,40,50,60,70,80,90};
		int search=20;
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		boolean found=false;
		for(int x=0;x<=a.length-1;x++)
		{
			if(search==a[x])
			{
				found=true;
				break;
			}
		}
		System.out.println(found?"element is found":"element is not found");
	}
}


class BinarySearch
{
	public static void main(String [] args)
	{
		int a[]=new int[]{12,20,30,40,50,60,70,80,90};
		int search=20;
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		int start=0,end=a.length-1;
		int mid;
		while(start<=end)
		{
			mid=(end+start)/2;

			if(search<a[mid])
			{
				end=mid-1;
			}
			else if(search>a[mid])
			{
				start=mid+1;
			}
			else
			{
				System.out.println("element is found"+mid);
				break;
			}
		}
	}
}


class Deletion
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,20,30,40,50,60,70,80,90};
		int search=20;
		int x;
		for( x=0;x<=a.length-1;x++)
		{
			if(search==a[x])
			{
				break;
			}
		}
		System.out.println(x);
		for(int z=x;z<a.length-1;z++)
		{
			a[z]=a[z+1];
		}
		for(int temp:a)
			System.out.print(temp+" ");

			
			
	}
}



class Uniq
{
	public static void main(String [] args)
	{
		int a[]=new int[]{12,33,55,12,67,89,55};
		boolean b[]=new boolean[a.length-1];
		int x,y,count=0;
		for(x=0;x<a.length-1;x++)
		{
			if(b[x]==true)
				continue;
			count=0;
			for(y=x+1;y<a.length-1;y++)
			{
				if(a[x]==a[y])
				{
					b[y]=true;
					count++;
				}
			}
			if(count==0)
				System.out.println(a[x]);
		}
	}
}

class Array
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter array elements:");
		for(int x=0;x<=n-1;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("Array is");
		for(int x=0;x<=n-1;x++)
			System.out.print(a[x]+" ");
	}
}


class Array1
{
	public static void main(String [] args)
	{
		int a[]=new int[]{1,2,3},









		
		




	
		

				
		

		
				
		
			
			
	