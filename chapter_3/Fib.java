class Fib
{
	public static void main(String[] args)
	{
		int f=0,s=1,t;
		System.out.println(f);
		System.out.println(s);
		for(int i=1;i<=8;i++)
		{
			t=s+f;
			System.out.println(t);
			f=s;
			s=t;
		}
	}
}




class Fib1
{
	public static void main(String[] args)
	{
		int f=0,s=1,t;
		
		for(int i=1;i<=10;i++)
		{
			t=s+f;
			System.out.println(s);
			f=s;
			s=t;
		}
	}
}


class Fact
{
	public static void main(String[] args)
	{
		int i,count=0,n=3,num=5;
		boolean b=true;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
				
			if(count==n)
			{
				b=false;
				System.out.println(i);
				break;
			}
			}
		}if(b==true)
			System.out.println("no "+n+"factor");
		
	}
}	

class Fact1
{
	public static void main(String[] args)
	{
		int i,count=0,r=0,n=7;
		for(i=2;count<n;i++)
		{
			if(i%2==0)
			{
				r=i;
				count++;
			}
		}
		System.out.println(r);
	}
}
				













