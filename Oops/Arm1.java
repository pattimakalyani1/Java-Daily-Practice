import java.util.Scanner;
class TwistArm
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		Arm arm=new Arm();
		arm.num=sc.nextInt();
		arm.temp=arm.num;
		arm.count=arm.noCount(arm.num);
		arm.sum=arm.sumOfPower(arm.count);
		
	}
}
class Arm
{
	int count,sum,temp,num;
	int noCount(int num)
	{
		while(num!=0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	int sumOfPower(int count)
	{
		while(temp!=0)
		{
			sum=sum+(int)Math.pow((temp%10),count);
			temp/=10;
		}
		return sum;
	}
}
		
	
	