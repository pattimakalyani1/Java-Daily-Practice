import java.util.Scanner;
class LeftRota1
{
	public static void main(String [] args)
	{
		int[]a=new int []{10,20,30,40,50};
		int x;
		int r=2;
		System.out.println("original");
		for(int temp1:a)
			System.out.print(temp1+" ");
		System.out.println();
		for(int y=1;y<r;y++)
		{
			int copy=a[0];
			for(x=0;x<a.length-1;x++)
			{
				a[x]=a[x+1];
				
			}
			a[a.length-1]=copy;
		}
		System.out.println("after rotataion:");
		for(int temp2:a)
			System.out.print(temp2+" ");
	}
}

/*

original
10 20 30 40 50
after rotataion:
30 40 50 10 20

*/


class LeftRota3
{
	public static void main(String [] args)
	{
		int [] a=new int[]{10,20,30,40,50,60,70,80,90,100}; 
		int r=2;
		int x,y;
		for( x=r,y=0;x<=a.length-1;x++,y++)
		{
			
			System.out.print(a[x]+" ");
		}
		for(x=0;x<=r-1;x++,y++)
		{
			
			System.out.print(a[x]+" ");
		}
		
		
	}
}



class LeftRota
{
	public static void main(String [] args)
	{
		int [] a=new int[]{10,20,30,40,50,60,70,80,90,100};
		int [] b=new int [a.length]; 
		int r=2;
		int x,y;
		for( x=r,y=0;x<=a.length-1;x++,y++)
		{
			b[y]=a[x];
			System.out.print(b[y]+" ");
		}
		for(x=0;x<=r-1;x++,y++)
		{
			b[y]=a[x];
			System.out.print(b[y]+" ");
		}
		
		
	}
}

/*
enter r values:
30
40
50
60
70
80
90
100
10
20

*/


//using methods:

class LeftRota2
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int [] a=new int[]{10,20,30,40,50,60,70,80,90,100};
		int [] b=new int [a.length]; 
		Sample1 sample=new Sample1();
		System.out.println("enter r values:");
		sample.r=sc.nextInt();
		int[] d=sample.printData(a);
		for(int temp:d)
		System.out.println(temp);
	
	}
}
class Sample1
{
	int r;
	int[] printData(int [] b)
	{	
		int x,y;
		int c[]=new int[b.length];
		for(x=r,y=0;x<=b.length-1;x++,y++)
		{
			c[y]=b[x];
		}
		for( x=0;x<=r-1;x++,y++)
		{
			c[y]=b[x];
		}
		return c;
	}
	
		
}

/*

enter r values:
2
30
40
50
60
70
80
90
100
10
20

*/