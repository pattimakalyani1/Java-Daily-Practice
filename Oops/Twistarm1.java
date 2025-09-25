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
		arm.temp1=arm.num;
		arm.temp2=arm.num;
		arm.count=arm.noCount(arm.num);
		arm.sum=arm.sumOfPower(arm.count);
		String result=arm.isArm(arm.sum);
		System.out.println(result);
		System.out.println(arm.ifArm(result));
		
	}
}
class Arm
{
	int count,sum,temp,num,temp1,rev,temp2;
	String result1;
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
	String isArm(int sum)
	{
		return temp1==sum?"armstrong":"not armstrong";
	}
	String isArm1(int sum)
	{
		return temp1==sum?"Twisted armstrong":"not Twisted armstrong";
	}

	
	int calRev(int temp2)
	{
		while(temp2!=0)
		{
			rev=rev*10+(temp2%10);
			temp2/=10;
		}
		return rev;
	}
		
	String ifArm(String result)
	{
		if(result=="armstrong")
		{
			rev=calRev(temp2);
			count=noCount(rev);
			sum=sumOfPower(count);
			result1=isArm1(sum);
		}
		else
			result1="canot check for twisted armstrong";
		return result1;
	}
}
			
















		
	
	