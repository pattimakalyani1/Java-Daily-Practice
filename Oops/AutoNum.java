import java.util.Scanner;
class Auto
{
	int calCount(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	int calSq(int num)
	{
		return num*num;
	}
	String isAuto(int num,int sq,int count)
	{
		int n1=sq%(int)(Math.pow(10,count));
		System.out.println(n1);
		System.out.println(num);
		return (n1==num)?"Automatic":"not automatic";
	}
	public static void main(String [] args)
	{
		Auto a= new Auto();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int count=a.calCount(num);
		System.out.println(count);
		int sq=a.calSq(num);
		System.out.println(sq);
		System.out.println(a.isAuto(num,sq,count));
	}
}
	
class Auto1
{
	int calCount(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	int calSq(int num)
	{
		return num*num;
	}
	String isAuto(int num)
	{
		int count=calCount(num);

		int sq=calSq(num);
		int n1=sq%(int)(Math.pow(10,count));
		return (n1==num)?"Automatic":"not automatic";
	}
	public static void main(String [] args)
	{
		Auto1 a= new Auto1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		System.out.println(a.isAuto(num));
	}
}
		