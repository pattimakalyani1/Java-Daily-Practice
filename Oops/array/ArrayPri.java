import java.util.Scanner;	
class ArrayPri
{
	public static void main(String [] args)
	{
		int count1=0;
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter array elements:");
		for(int x=0;x<=a.length-1;x++)
		a[x]=sc.nextInt();
		for(int x=0;x<=a.length-1;x++)
		{
			int count=0;
			for(int y=2;y<=a[x]/2;y++)
			{
				
				if(a[x]%y==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				count1++;
				System.out.println(a[x]+"is prime");
			}
	
		}
		System.out.println("no of primes:"+count1);
	}
}


/*
Enter array elements:
2
4
5
6
7
2is prime
5is prime
7is prime
no of primes:3
*/

//using methods
class ArrayPri1
{
	boolean isPrime(int num)
	{
		
		int count=0;
		for(int y=2;y<=num/2;y++)
			{
				if(num%y==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && num!=1 )
			{
				return true;
			}
		return false;
	}

		
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter array elements:");
		for(int x=0;x<=a.length-1;x++)
		a[x]=sc.nextInt();
		ArrayPri1 ap=new ArrayPri1();
		int x,count1=0;
		for(x=0;x<=a.length-1;x++)
		{
			boolean b=ap.isPrime(a[x]);
			if(b)
			{
				count1++;
				System.out.println(a[x]+"prime");
			}	
		}
		System.out.println(count1);
	
	}
}

 z
//using array parameters

class ArrPri3
{
	int[] isPrime(int [] b)
	{
		int d[]=new int [b.length];
		int count=0;
		for(int x=0;x<=b.length-1;x++)
		{
			int num=b[x];
			//count=0;
			if(num<2)
			{
				continue;
			}
			boolean f=true;
			for(int y=2;y<=num/2;y++)
			{

				if(num%y==0)
				{
					f=false;
					break;
				}
			}
		
		if(f)
		{
			d[count]=num;
			count++;			
		}
		}
		int [] v=new int[count];
		for(int x=0;x<=v.length-1;x++)
			v[x]=d[x];
		return v;
	}
	public static void main(String [] args)
	{
		ArrPri3 ar=new ArrPri3();
		int [] a=new int[]{1,9,2,3,4,5};
		int c[]=ar.isPrime(a);
		for(int temp:c)
		{
			System.out.println(temp);
		
		}
		System.out.println("no of primes in a array:"+c.length);
			

	}
}

/*

2
3
5
no of primes in a array:3

*/

//using Arrya parameters(using boolean values)

class ArrPri2
{
	int[] isPrime(int [] b)
	{
		int d[]=new int [b.length];
		for(int x=0;x<=b.length-1;x++)
		{
			int num=b[x];
			int count=0;
			if(num<2)
			{
				d[x]=0;
				continue;
			}
			for(int y=2;y<=num/2;y++)
			{

				if(num%y==0)
				{
					count++;
					break;
				}
			}
		
		if(count==0)
			d[x]=1;
		else
			d[x]=0;
		}
		return d;
			
	}
	public static void main(String [] args)
	{
		ArrPri2 ar=new ArrPri2();
		int [] a=new int[]{1,9,2,3,4,5};
		int c[]=ar.isPrime(a);
		for(int x=0;x<=a.length-1;x++)
		{
			if(c[x]==1)
			System.out.println(a[x]+"prime");
		}
			

	}
}





































	