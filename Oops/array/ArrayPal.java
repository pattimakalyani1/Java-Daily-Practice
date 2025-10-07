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


















