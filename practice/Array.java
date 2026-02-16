import java.util.Scanner;
class Array
{
	public static void main(String [] args)
	{
		int num=9;
		int n=num*num,sum=0;
		
		while(n!=0)
		{
			sum=sum+(n%10);
			n=n/10;
		}
		System.out.println(sum==num?"Evil number":"not eveil number");
	}
}


class Arr1
{
	public static void main(String [] args)
	{
		int n=132,sum=0,mul=1;
		while(n!=0)
		{
			sum=sum+n%10;
			mul=mul*n%10;
			n=n/10;
		}
		System.out.println(sum==mul?"power number":"not power number");
	}
}


class Busy
{
	public static void main(String [] args)
	{
		int n=567;
		if(n%10==7||n/7==0)
			System.out.println("busy number");
		else
			System.out.println("not busy number");
	}
}

class Auto
{
	public static void main(String [] args)
	{
		int n=76,c=0;
		int num=n*n;
		while(n!=0)
		{
			c++;
			n=n/10;
		}
		System.out.println(num%c==n?"automatic number":"not automatic number");
	}
}


class Secmax
{
	public static void main(String [] args)
	{
		int n=2956,max=Integer.MIN_VALUE,secmax=max,num=0;
		while(n!=0)
		{
			num=n%10;
			if(max<num)
			{
				secmax=max;
				max=num;
			}
			else if(max!=num && secmax<num)
			{
				secmax=num;
			}
			n=n/10;
		}
		System.out.println("max element :"+max);
		System.out.println("secmax element :"+secmax);
	}
}


class Arr2
{
	public static void main(String [] args)
	{
		int a[]=new int[]{1,2,3,4,5};
		int sum=0,mul=1;
		for(int temp:a)
		{
			sum=sum+temp;
			mul=mul*temp;
		}
		System.out.println("sum :"+sum);
		System.out.println("product:"+mul);
	}
}

class Arr3
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=sc.nextInt();
		int [] a=new int[n];
		System.out.println("enter elements in a array:");

		for(int x=0;x<=n-1;x++)
		{
		
			a[x]=sc.nextInt();
		}
		for(int x=0;x<=n-1;x++)
		{
			System.out.print(a[x]+" ");
		}
	}
}


class Arr4
{
	public static void main(String [] args)
	{
		int a[]=new int[]{1,2,3,4,5};
		int sum=0,mul=1,count=0;
		for(int temp:a)
		{
			if(temp%2==0){
				System.out.println("even numbers in a array:"+temp);
				count++;
			}
		}System.out.println("no  of even numbers:"+count);
	}
}

class Arr5
{
	public static void main(String [] args)
	{
		int a[]=new int[]{1,2,3,4,6};
			
		//prime
		/*for(int x=0;x<a.length;x++)
		{
			int count=0;
			if(a[x]==1)
				count++;
			for(int y=2;y<=a[x]/2;y++)
			{
				
				if(a[x]%y==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(a[x]);
		}*/

		//armstrong
		/*for(int x=0;x<=a.length-1;x++)
		{
			int count=0,sum=0;
			int num=a[x],num1=num;
			while(a[x]!=0)
			{
				count++;
				a[x]=a[x]/10;
			}
			while(num!=0)
			{
				int rem=num%10;
				sum=sum+(int)Math.pow(rem,count);
				num=num/10;
			}
			if(sum==num1)
				System.out.println(sum);
		}

		//palindrome
		for(int x=0;x<=a.length-1;x++)
		{
			int rev=0;
			int num=a[x];
			while(a[x]!=0)
			{
				rev=rev*10+(a[x]%10);
				a[x]=a[x]/10;
			}
			if(rev==num)
			System.out.println(rev);
		}*/

		
		for(int x=0;x<=a.length-1;x++)
		{	
			int f=0,s=1,t=0;
			for(int y=0;y<a[x]-1;y++)
			{
				System.out.print(f+" ");

				t=f+s;
				f=s;
				s=t;
			}
			System.out.println();
		}

				
			 
		


			
			
				
			
	}
}

		
		
			

			
						
			
		
			
			




		


			

			
						
		
		