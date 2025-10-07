import java.util.Scanner;
class Evil
{
	
	int calSq(int num)
	{
		 int n=(int)Math.pow(num,2);
		return n;
	}
	int calSum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=sum+(n%10);
			n/=10;
		}
		return sum;
	}
	void isEvil(int num,int sum)
	{
		System.out.println(num==sum?"Evil":"not Evil");
	}
	
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		Evil e=new Evil();
		int num=sc.nextInt();
		int n=e.calSq(num);
		int sum=e.calSum(n);
		e.isEvil(num,sum);
	}
}
	

class Evil2
{
	
	int calSq(int num)
	{
		return (int)Math.pow(num,2);
		
	}
	int calSum(int num)
	{
		int n=calSq(num);
		int sum=0;	
		while(n!=0)
		{
			sum=sum+(n%10);
			n/=10;
		}
		return sum;
	}
	void isEvil(int n)
	{
		int sum=calSum(n);
		System.out.println(n==sum?"Evil":"not Evil");
	}
	
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		Evil2 e=new Evil2();
		int num=sc.nextInt();
		e.isEvil(num);
		
		
	}
}
	