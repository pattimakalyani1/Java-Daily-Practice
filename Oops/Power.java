import java.util.Scanner;
class Power
{
	int calSum(int num)
	{
		int sum=0;
		while(num!=0)
		{
			sum=sum+(num%10);
			num/=10;
		}
		return sum;
	}
	int calPro(int num)
	{
		int pro=1;
		while(num!=0)
		{
			pro=pro*(num%10);
			num/=10;
		}
		return pro;
	}
	String isPower1(int sum,int pro)
	{
		return (sum==pro)?"power number":"not a power number";
	}
	public static void main(String [] args)
	{
	Power p=new Power();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number:");

	int num=sc.nextInt();
	int sum=p.calSum(num);
	System.out.println(sum);
	int pro=p.calPro(num);
	System.out.println(pro);

	System.out.println(p.isPower1(sum,pro));
	}
}


//here in one method other method is called

class Power1
{
	int calSum(int num)
	{
		int sum=0;
		while(num!=0)
		{
			sum=sum+(num%10);
			num/=10;
		}
		return sum;
	}
	int calPro(int num)
	{
		int pro=1;
		while(num!=0)
		{
			pro=pro*(num%10);
			num/=10;
		}
		return pro;
	}
	String isPower1(int num)
	{
		int sum=calSum(num);
		int pro=calPro(num);
		return (sum==pro)?"power number":"not a power number";
	}
	public static void main(String [] args)
	{
	Power1 P=new Power1();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number:");

	int num=sc.nextInt();
	System.out.println(P.isPower1(num));
	}
}
	