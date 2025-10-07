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








































	