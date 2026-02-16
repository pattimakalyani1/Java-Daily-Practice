import java.util.*;
class Practice
{
	public static void main(String [] args)
	{
		int n1=10,n2=100,n3=78;
		if(n1>n2 && n1>n3)
			System.out.println("n1 is greater "+n1);
		else if(n2>n1 && n2>n3)
			System.out.println("n2 is greater "+n2);
		else
			System.out.println("n3 is greater "+n3);
	}
}


class P1
{
	public static void main(String [] args)
	{
		int n1=121,rev=0,temp=n1;
		while(n1!=0)
		{
			int rem=n1%10;
			rev=rev*10+rem;
			n1=n1/10;
		}
		System.out.println(rev==temp?"palindrome":"not palindrome");
	}
}

class P2
{
	public static void main(String [] args)
	{
		int n1=153,sum=0,temp=n1,temp1=n1,count=0;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		System.out.println(count);
		while(n1!=0)
		{
			int rem=n1%10;
			sum=sum+(int)Math.pow(rem,count);
			System.out.println(sum);
			n1=n1/10;
		}
		System.out.println(sum);
		System.out.println(sum==temp1?"armstrong":"not armstrong");
	}
}

class P3
{
	public static void main(String [] args)
	{
		int n1=1234,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		while(n1!=0)
		{
			int rem=n1%10;
			if(rem<min)
				min=rem;
			if(rem>max)
				max=rem;
			n1/=10;
		}
		System.out.println(max+min);
	}
}


class P4
{
	public static void main(String [] args)
	{
		int n1=16789,count=0,rem=0,temp=n1;
		for(int x=0;x<=9;x++)
		{
			n1=temp;
			count=0;
			while(n1!=0)
			{
				 rem=n1%10;
				if(rem==x)
					count++;
				
				n1/=10;
			}
			
			if(count==0)
				System.out.println(x);
		}
	}
}


class P5
{
	public static void main(String [] args)
	{
		int x=15,count=0;
		for(int y=2;y<=x/2;y++)
		{
			if(x%y==0)
			{
				count++;
				break;
			}
		}
		System.out.println(count==0?"prime":"not prime");
	}
}

class P6
{
	public static void main(String [] args)
	{
		for(int x=2;x<=100;x++)
		{
			int n=x,count=0;
			for(int y=2;y<=x/2;y++)
			{
				if(n%y==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(n);
		}
	}
}


//Arrays coding:

class A1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int n=sc.nextInt();	
		int [] a=new int[n];
		for(int x=0;x<n;x++)
		{
			System.out.println("enter array "+x+"th element:");
			a[x]=sc.nextInt();
		}
		for(int temp:a)
			System.out.print(temp+" ");
	}
}

class A2
{
	public static void main(String [] args)
	{
		int a[]=new int[]{1,2,3,4};
		int sum=0,mul=1;
		int count=0;
		for(int temp:a)
		{
			sum=sum+temp;
			mul=mul*temp;
			if(temp%2==0)
			{
				count++;
				System.out.println(temp);
			}

		}
		System.out.println("sum:"+sum);
		System.out.println("mul:"+mul);
		System.out.println("no of even numbers in a array: "+count);
	}
}

class A3
{
	public static void main(String [] args)
	{
		int a[]=new int[]{121,303,602,101,5,9};
		for(int temp:a)
		{
			int count=0;
			for(int x=2;x<=temp/2;x++)
			{
				if(temp%x==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			
				System.out.println(temp);
		}
		System.out.println("palindorme");

		for(int temp:a)
		{
			int rev=0,n=temp;
			while(temp!=0)
			{
				int rem=temp%10;
				rev=rev*10+rem;
				temp/=10;
			}
			if(rev==n)
				System.out.println(rev);
		
		}
		System.out.println("armstrong:");
		for(int temp:a)
		{
			int sum=0,n=temp,n1=temp,count=0;
			while(temp!=0)
			{
				count++;
				temp/=10;
			}
			
			while(n!=0)
			{
				int rem=n%10;
				sum=sum+(int)Math.pow(rem,count);
				n/=10;
			}
			if(sum==n1)
				System.out.println(sum);
		}
	
				
				
	}
}


class A4
{
	public static void main(String [] args)
	{
		char c[]=new char[]{'a','A','Y','9',' ','@'};
		int countA=0,counta=0,countn=0,countSy=0,counts=0;
		for(char temp:c)
		{
			if(temp>='A' && temp<='Z')
			{
				countA++;
			}
			else if(temp>='a' && temp<='z')
			{
				counta++;
			}
			else if(temp>='0' && temp<='9')
			{
				countn++;
			}
			else if(temp==' ')
			{
				counts++;
			}
			else
			{
				countSy++;
			}
		}
		System.out.println("big:"+countA);
	}
}


class A5
{
	public static void main(String [] args)
	{
		int []a=new int[]{1,2,4,6,7};
	
		for(int x=0;x<=9;x++)
		{
			boolean b=false;
			for(int temp:a)
			{
				if(temp==x)
				{
					b=true;
					break;
				}
			}
			if(b==false)
				System.out.println(x);
		}
	}
}
					

class A6//Linear search
{
	public static void main(String [] args)
	{
		int a[]=new int[]{1,2,6,54,6,5,7};
		int search=6;
		for(int x=0;x<=a.length-1;x++)
		{
			if(search==a[x])
			{
				System.out.println("search is found in index "+x);
			}
		}
	}
}

class A7//Left Rotation
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,20,30,40,50,60};
		int r=2;
		for(int x=0;x<r;x++)
		{
			int copy=a[0];
			for(int y=0;y<a.length-1;y++)
			{
				a[y]=a[y+1];
			}
			a[a.length-1]=copy;
		}
		for(int temp:a)
			System.out.print(temp+" ");
	}
}
			
//30 40 50 60 10 20


class A8//Right Rotation
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,20,30,40,50,60};
		int r=2;
		for(int x=0;x<r;x++)
		{
			int copy=a[a.length-1];
			for(int y=a.length-1;y>0;y--)
			{
				a[y]=a[y-1];
			}
			a[0]=copy;
		}
		for(int temp:a)
			System.out.print(temp+" ");
	}
}

//50 60 10 20 30 40


class A9//delete
{
	public static void main(String [] args)
	{
		int[] a=new int[]{10,20,30,40,50};
		int del=40,x;
		
		for(x=0;x<=a.length-1;x++)
		{
			if(del==a[x])
			{
				break;
			}		
		}
		for(int z=x;z<a.length-1;z++)
		{
			a[z]=a[z+1];
		}

		for(int temp:a)
			System.out.print(temp+" ");
	
	}
}

//10 20 30 50 50


class A10//selection sort
{
	public static void main(String [] args)
	{
		int [] a=new int[]{10,91,8,6,13,81,100};
		for(int x=0;x<a.length-1;x++)
		{
			int min=x;
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[min]>a[y])
				{
					min=y;
				}
			}
			int temp=a[x];
			a[x]=a[min];
			a[min]=temp;
		}
		for(int temp1:a)
		{
			System.out.print(temp1+" ");
		}
	}
}


//6 8 10 13 81 91 100


class A11//Binary Search
{
	public static void main(String [] args)
	{
		int [] a=new int[]{1,2,34,56,67,89};
		int search=2,start=0,end=a.length-1,mid;
		boolean b=false;
		while(start<=end)
		{
			mid=(start+end)/2;
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
				b=true;
				System.out.println("search element is found "+mid);
				break;
			}
		}
		if(b==false)
			System.out.println("search element is not found");
	}
}

class A12//Bubble sort
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,20,32,3,1,4,32};
		for(int x=0;x<a.length-1;x++)
		{
		
			for(int y=0;y<a.length-1-x;y++)
			{
				if(a[y]>a[y+1])
				{
					int temp=a[y];
					a[y]=a[y+1];
					a[y+1]=temp;
				}
			}
		}
		for(int temp:a)
			System.out.print(temp+" ");
	}
}

//1 3 4 10 20 32 32


class A13//unique
{
	public static void main(String [] args)
	{
		int []a=new int[]{10,12,23,12,56,78,78};
		boolean b[]=new boolean[a.length];
		
		for(int x=0;x<a.length-1;x++)
		{
			int count=0;
			if(b[x]==true)
				continue;
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[y]==a[x])
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

//10 23 56


class A14//duplicate
{
	public static void main(String [] args)
	{
		int []a=new int[]{10,12,23,12,56,78,78};
		boolean b[]=new boolean[a.length];
		
		for(int x=0;x<a.length-1;x++)
		{
			int count=0;
			if(b[x]==true)
				continue;
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[y]==a[x])
				{
					b[y]=true;
					count++;
				}
			}
			if(count>0)
				System.out.println(a[x]);
		}
		
		
	}
}


class A15//frequency
{
	public static void main(String [] args)
	{
		int []a=new int[]{10,12,23,12,56,78,78};
		boolean b[]=new boolean[a.length];
		
		for(int x=0;x<a.length-1;x++)
		{
			int count=1;
			if(b[x]==true)
				continue;
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[y]==a[x])
				{
					b[y]=true;
					count++;
				}
			}
				System.out.println(a[x]+" "+count);
		}
		
		
	}
}


class A16//secmax
{
	public static void main(String [] args)
	{
		int a[]=new int[]{1,34,2,4,676};
		int max=Integer.MIN_VALUE,secmax=max;
		for(int x=0;x<=a.length-1;x++)
		{
			if(max<a[x])
			{
				secmax=max;
				max=a[x];
			}
			else if(max!=0 && secmax<a[x])
			{
				secmax=a[x];
			}
		}
		System.out.println(secmax);
	}
}


class A17//Anagrams
{
	public static void main(String [] args)
	{
		int []a=new int[]{10,30,20,20,40,50};
		int []b=new int[]{10,20,30,40,20,50};
		
		boolean b1=true;
		if(a.length==b.length)
		{
			Arrays.sort(a);
			Arrays.sort(b);
			for(int x=0;x<=a.length-1;x++)
			{
				if(a[x]!=b[x])
				{
					b1=false;
					break;
				}
			}
			if(b1==false)
				System.out.println("not anagaram");
			else
				System.out.println("anagaram");
		}
		else
			System.out.println("not anagram");
	}
}

//anagaram

class A18//uniqmax
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,45,45,2,6};
		boolean b[]=new boolean[a.length];
		for(int x=0;x<=a.length-1;x++)
		{
			if(b[x]==true)
				continue;
			int count=1;
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==a[y])
				{
					b[y]=true;
				}
			}
		}
	}
}

class A19//prime
{
	public static void main(String [] args)
	{
		int a=11,count=0;
		for(int x=2;x<=a/2;x++)
		{
			if(a%x==0)
			{
				count++;
				break;
			}
		}
		System.out.println(count==0?"prime":"not prime");
	}
}

class A20//armstrong
{
	public static void main(String [] args)
	{
		int n=153,count=0,sum=0,temp=n,temp1=n;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		while(temp!=0)
		{
			int rem=temp%10;
			sum=sum+(int)Math.pow(rem,count);
			temp/=10;
		}
		System.out.println(sum==temp1?"armstrong":"not armstrong");
	}
}

class A21//palindrome
{
	public static void main(String [] args)
	{
		int n=121,rev=0,temp=n;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+(rem);
			n/=10;
		}
		System.out.println(rev==temp?"palindrome":"not palindrome");
	}
}


class A22
{
	public static void main(String [] args)
	{
		int n=4,fib=1;
		for(int x=1;x<=n;x++)
		{
			fib=fib*x;
		}
		System.out.println(fib);
	}
}

class A23
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
	
		int a=sc.nextInt();
		System.out.println("enter a number");
		int b=sc.nextInt();
		for(int x=a;x<=b;x++)
		{
			int n=x,count=0;
			for(int y=2;y<=n/2;y++)
			{
				if(n%y==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(n);
		}
	}
}


class A24//palind
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		System.out.println("enter a number");
		int b=sc.nextInt();
		for(int x=a;x<=b;x++)
		{
			int n=x,rev=0,temp=n;
			while(n!=0)
			{
				int rem=n%10;
				rev=rev*10+rem;
				n/=10;
			}
			if(rev==temp)
				System.out.println(temp);
		}
	}
}



class A25//armst
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		System.out.println("enter a number");
		int b=sc.nextInt();
		for(int x=a;x<=b;x++)
		{
			int n=x,sum=0,temp=n,temp1=n,count=0;
			while(temp1!=0)
			{
				count++;
				temp1/=10;
			}
			while(n!=0)
			{
				int rem=n%10;
				sum=sum+(int)Math.pow(rem,count);
				n/=10;
			}
		
			if(sum==temp)
				System.out.println(temp);
		}
	}
}


class A26//fib
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		System.out.println("enter a number");
		int b=sc.nextInt();
		for(int x=a;x<=b;x++)
		{
			int n=x,fib=1;
			for(int y=1;y<=n;y++)
			{
				fib*=y;
			}
			System.out.println(n+"===>"+fib);
		}
	}
}


class A27
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,20,20,30,40,40,57};
		boolean b[]=new boolean[a.length];
		for(int x=0;x<=a.length-1;x++)
		{
			if(b[x]==true)
				continue;
			int count=0;
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=true;
					break;
				}
			}
			
			if(count==0)
				System.out.println(a[x]);
			
		}
	}
}

//10  30  57


class A28
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,20,20,30,40,40,57};
		boolean b[]=new boolean[a.length];
		for(int x=0;x<=a.length-1;x++)
		{
			if(b[x]==true)
				continue;
			int count=1;
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=true;
					
				}
			}
			System.out.println(a[x]+" : "+count);
			
		}
	}
}

//10 : 1
//20 : 2
//30 : 1
//40 : 2
//57 : 1



/*class A
{
	void m1()
	{
		System.out.println("A");
	}
}
class B
{
	void m1()
	{
		System.out.println("B");
	}
}
class C extends A,B
{
	public static void main(String [] args)
	{
		C c=new c();	
		c.m1();
	}
}*/



interface A
{
	void m1();
}
interface B
{
	void m1();
}	
class AB implements A,B
{
	public static void main(String [] args)
	{
		AB ab=new AB();
		ab.m1();
		
	}
	public void m1()
	{
		System.out.println("m1");
	}
}


interface Hello
{
	void m1();
	void m2();
}

class Hai implements Hello
{
	public void m1()
	{
		System.out.println("m1);
	}
	public void m2()
	{
		System.out.println("m2);
	}
	
	public static void main(String [] args)
	{
		Hai h=new Hai();
		h.m1();
		h.m2();
	}
}

	






	
			
		



		

		




			
			
			






		






			


			


		
		
			

					
		
				
	
		
		
		 
	
	






		
			
		
		

 
		


		
		


		
			




















			
