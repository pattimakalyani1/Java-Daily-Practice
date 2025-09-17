class Main
{
	public static void main(String [] args)
	{
		int num=653;
		while(num!=0)
		{
			int rem=num%10;
			int fact=1;
			for(int i=rem;i>=1;i--)
			{
				fact*=i;
			}
			System.out.println(fact);

			num/=10;
		}
	}
}



class Main1
{
	public static void main(String [] args)
	{
		int num=8463;
		while(num!=0)
		{
			int rem=num%10;
			System.out.print(rem+":");
			int f=0,s=1,t=0;
			for(int i=1;i<=rem;i++)
			{
				System.out.print(f+" ");
				t=s+f;
				f=s;
				s=t;
			}
			num/=10;
			System.out.println();
		}
	}
}



class Main2
{
	public static void main(String [] args)
	{
		int num=8463;
		int f=0,s=1,t=0;
		while(num!=0)
		{
			int rem=num%10;
			System.out.print(rem+":");
			//int f=0,s=1,t=0;
			for(int i=1;i<=rem;i++)
			{
				System.out.print(f+" ");
				t=s+f;
				f=s;
				s=t;
			}
			num/=10;
			System.out.println();
		}
	}
}



class Main3
{
	public static void main(String [] args)
	{
		int num=675693;
		while(num!=0)
		{
			int rem=num%100;
			System.out.println((char)(rem));
			int rev=0,rem1=0;
			while(rem!=0)
			{
				rem1=rem%10;
				rev=rev*10+rem1;
				rem/=10;
				
			}
			System.out.println((char)(rev));
			num/=100;
		}
	}
}



class Main4
{
	public static void main(String [] args)
	{
		int n=349;
		while(n!=0)
		{

		 	 int temp=n,rem=0,rev=0,sum=0;
			while(n!=0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n/=10;
			}
			if(rev==temp)
			{
				System.out.println(rev);
				System.out.println(temp);
				System.out.println("Palindorme");
				n=0;
				break;
			}
			else
			{
				sum+=temp+rev;
				n=sum;
			}
		}
	}
}
			


class Pattern
{
	public static void main(String [] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
		System.out.println("*");
		}
	}
}
	
			
class Pattern1
{
	public static void main(String [] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		System.out.println();
		}
	}
}
	

			
class Pattern2
{
	public static void main(String [] args)
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		System.out.println();
		}
	}
}
		


			
class Pattern3
{
	public static void main(String [] args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i+4;j++)
			{
				System.out.print(j);
			}
		System.out.println();
		}
	}
}
		

























