import java.util.Scanner;
class Main
{
	
	int calDig(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	int splitSum(int num,int count)
	{
		int n1=num%(int)(Math.pow(10,count/2));
		int n2=num/(int)(Math.pow(10,count/2));
		return n1+n2;
	}
	String sqIsTech(int sum,int num)
	{
		return (sum*sum==num)?"Tech":"not Tech";
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int num=sc.nextInt();
		Main m=new Main();
	       
		int c=m.calDig(num);
		int sum=m.splitSum(num,c);
		System.out.println(m.sqIsTech(sum,num));
	}
}

class Main1
{
	
	int calDig(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	int splitSum(int num)
	{
		int count=calDig(num);
		int n1=num%(int)(Math.pow(10,count/2));
		int n2=num/(int)(Math.pow(10,count/2));
		return n1+n2;
	}
	String sqIsTech(int num)
	{
		int sum=splitSum(num);
		return (sum*sum==num)?"Tech":"not Tech";
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int num=sc.nextInt();
		Main1 m1=new Main1();		
		System.out.println(m1.sqIsTech(num));
	}
}

