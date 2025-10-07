import java.util.Scanner;
class Inav
{
	int calSum(int num)
	{
		
		while(num>9)
		{
			int sum=0;
			while(num!=0)
			{
				sum=sum+(num%10);
				num/=10;
			}
			num=sum;
		}
		
		return num;
	}
	String isInav(int sum)
	{
		return sum==1?"Inav":"Not inav";
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		Inav inav=new Inav();
		int num=sc.nextInt();
		//System.out.println(num);
		int sum=inav.calSum(num);
		// System.out.println(sum);
		System.out.println(inav.isInav(sum));
	}
}
	