class Num
{
	public static void main(String [] args)
	{
		int n=1;
		System.out.println("numbers from 1 to 10");
		while(n<=10)
		{
			System.out.println(n);
			++n;
		}
	}
}



class Numeven
{
	public static void main(String [] args)
	{
		int n=0;
		System.out.println("even numbers between 1 and 50");
		while(n<=50)
		{
			if(n%2==0)
			{
				System.out.println(n);
			}
			++n;
		}
	}
}



class Numtable
{
	public static void main(String [] args)
	{
		int n=5,i=1;
		while(i<=10)
		{
			System.out.println(i+"*"+n+"="+n*i);
			++i;
		}
	}
}



class Numsum
{
	public static void main(String [] args)
	{
		int n=567,sum=0,rem=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n/=10;
		}
		System.out.println(sum);
	}
}



class Fact
{
	public static void main(String [] args)
	{
	int n=5,i=1,fact=1;
	while(i<=n)
	{ 
		fact=fact*i;
		++i;
	}System.out.println(fact);
	}
}
		


class Fib
{
	public static void main(String [] args)
	{
	int n=7,a=0,b=1,i=1;
	while(i<=n)
	{
		c
