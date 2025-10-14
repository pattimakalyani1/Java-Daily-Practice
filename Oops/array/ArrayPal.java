import java.util.Scanner;	
class ArrayPal
{
	public static void main(String [] args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter array elements:");
		for(int x=0;x<=a.length-1;x++)
		a[x]=sc.nextInt();
		for(int x=0;x<=a.length-1;x++)
		{
			int rev=0;
			int number=a[x];
			int temp=number;
			while(number!=0)
			{
				rev=rev*10+(number%10);
				number/=10;
			}
			if(temp==rev)
			{
				count++;
				System.out.println(a[x]+"palindrome");
			}
		}
		System.out.println(count);	

	}
}
		

/*
Enter array elements:
121
3
11
12
34
121palindrome
3palindrome
11palindrome
3
*/

//using methods

class ArrayPal1
{							
	boolean isPal(int num)
	{
		int rev=0;
		int number=num;
		int temp=number;
		while(number!=0)
		{
			rev=rev*10+(number%10);
			number/=10;
		}
		if(temp==rev)
		{
			return true;
		}
		return false;
	}
	public static void main(String [] args)
	{	
		int count=0;
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter array elements:");
		for(int x=0;x<=a.length-1;x++)
		a[x]=sc.nextInt();
		ArrayPal1 ap=new ArrayPal1();
		for(int x=0;x<=a.length-1;x++)
		{
			boolean b=ap.isPal(a[x]);
			if(b)
			{	
				count++;
				System.out.println(a[x]+"palindrome");
			}
		}
		System.out.println(count);
			
					
			

	}
}




//using array parameter:

class ArrayPal3
{
	public static void main(String [] args)
	{
		int a[]=new int[]{121,11,131,32,43,654};
		ArrayPal3 ap=new ArrayPal3();
		int d[]=ap.isPalin(a);
		for(int temp:d)
			System.out.println(temp+" ");
		System.out.println("no of palindrome in array:"+d.length);
	}
	int[] isPalin(int [] a)
	{
		int [] b=new int[a.length];	
		int count=0;
		for(int x=0;x<=a.length-1;x++)
		{
			int rev=0,copy=a[x];
			while(a[x]!=0)
			{
				rev=rev*10+(a[x]%10);
				a[x]/=10;
			}
			if(copy==rev)
			{
				count++;
				b[x]=copy;
			}
		
		}
		int [] c=new int[count];
		for(int x=0;x<=c.length-1;x++)
		{
			c[x]=b[x];
		}
		return c;
	}
}

/*

121
11
131
no of palindrome in array:3

*/


//using array parameters:(using booleans values)

class ArrayPal2
{
	public static void main(String [] args)
	{
		int a[]=new int[]{121,11,131,32,43,654};
		ArrayPal2 ap=new ArrayPal2();
		int c[]=ap.isPalin(a);
		for(int x=0;x<=a.length-1;x++)
		{	
			if(c[x]==1)
				System.out.println(a[x]+" is palindrome");
		}
	}
	int[] isPalin(int [] b)
	{
		int [] d=new int [b.length];
		for(int x=0;x<=b.length-1;x++)
		{
			int num=b[x],temp=num;
			int rev=0;
			while(num!=0)
			{
				rev=rev*10+(num%10);
				num/=10;
			}
			if(temp==rev)
				d[x]=1;
			else
				d[x]=0;
		}
		return d;
	}
}


















