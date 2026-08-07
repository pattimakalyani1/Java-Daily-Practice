//prime
class A1
{
	public static void main(String [] args)
	{
		int a=10;
		for(int y=2;y<=a;y++)
		{
			int count=0;
			for(int x=2;x<=y/2;x++)
			{
				if(y%x==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(y);
		}
	}
}

/*
2
3
5
7

*/

//pallindrome
class A2
{
	public static void main(String [] args)
	{
		int a=121,rev=0,temp=a;
		while(a!=0)
		{
			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println(rev==temp?"palindrome":"not palindrome");
	}
}


//palindrome in a range
class A3
{
	public static void main(String [] args)
	{
		int n=121;
		for(int x=0;x<=n;x++)
		{
			int a=x,rev=0,temp=a;
			while(a!=0)
			{
				int rem=a%10;
				rev=rev*10+rem;
				a=a/10;
			}
			if(rev==temp)
				System.out.println(temp);

		}
	}
}

//Armstrong in range
class A4
{
	public static void main(String [] args)
	{
		int n=153;
		for(int x=0;x<=n;x++)
		{
			int a=x,sum=0,temp=x,temp1=x,count=0;
			while(a!=0)
			{
				count++;
				a=a/10;
			}
			while(temp!=0)
			{
				int rem=temp%10;
				sum=sum+(int)Math.pow(rem,count);
				temp/=10;
			}
			if(temp1==sum)
				System.out.println(temp1);
		}
	}
}


//Factorial
class A5
{
	public static void main(String [] args)
	{
		int n=10;
		for(int x=1;x<=n;x++)
		{
			int a=x,fact=1;
			for(int y=1;y<=a;y++)
			{
				fact=fact*y;
			}
			System.out.println(a+" "+fact);
		}
	}
}


/*
//fibnocci
class A6
{
	public static void main(String [] args)
	{
		int n=10;
		for(int x=1;x<=n;x++)
		{
			int first=0;second=1,third;
			for(int y=;y<=	
*/

//Evil number=>9^2=81=8+1=9
class A7
{
	public static void main(String [] args)
	{
		int a=9,b=a*a,sum=0;
		while(b!=0)
		{
			int rem=b%10;
			sum=sum+rem;
			b/=10;
		}
		if(sum==a)
			System.out.println("evil number "+a);
	
	}
}

//Power number=>132=1*3*2==1+3+2
class A8
{
	public static void main(String [] args)
	{
		int n=132,sum=0,mul=1;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			mul=mul*rem;
			n/=10;
		}
		System.out.println(sum==mul?"power number":"not a power number");

	}
}


//busy number=>last digit is 7 or a number is divisible by 7
class A9
{
	public static void main(String [] args)
	{
		int n=147;
		if(n%10==7 || n%7==0)
		{
			System.out.println("Busy number "+n);
		}
	}
}

//Inax
class A10
{
	public static void main(String [] args)
	{
		int n=199;
		while(n>9)
		{
			int sum=0;
			while(n!=0)
			{
				int rem=n%10;
				sum=sum+rem;
				n/=10;
			}
			n=sum;
		}
		System.out.println(n==1?"inav number":"not a inav number");
	}
}


//max value in a array
class A11
{
	public static void main(String [] args)
	{
		int a[]=new int[]{12,34,45,67,78,98,76};
		int max=Integer.MIN_VALUE;
		for(int x=0;x<=a.length-1;x++)
		{
			if(max<a[x])
			{
				max=a[x];
			}
		}
		System.out.println(max);
	}
}


class A12
{
	public static void main(String [] args)
	{
		int a[]=new int[]{12,34,45,67,78,98,76};
		int max=Integer.MIN_VALUE;
		for(int x=0;x<=a.length-1;x++)
		{
			if(max<a[x])
			{
				max=a[x];
			}
		}
		System.out.println(max);
	}
}

//secmax and max
class A13
{
	public static void main(String [] args)
	{
		int a[]=new int[]{12,34,45,67,78,98,76};
		int max=Integer.MIN_VALUE,secmax=max;
		for(int x=0;x<=a.length-1;x++)
		{
			if(max<a[x])
			{
				secmax=max;
				max=a[x];
			}
			else if(max>a[x] &&secmax<a[x])
			{
				secmax=a[x];
			}
		}
		System.out.println(max+" "+secmax);

	}
}


	

		










			




































				

				
		


































