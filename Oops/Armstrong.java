class Armstrong
{
	public static void main(String [] args)
	{
		Arm arm=new Arm();
		arm.num=163;
		arm.copy=arm.num;
		arm.copy1=arm.num;
		arm.noDig();
		arm.isSum();
		arm.checkArmstrong();
	}
}
class Arm
{
	int sum;
	int num,copy,count,copy1;
	void noDig()
	{
		while(num!=0)
		{
			count++;
			num/=10;
		}
	}
	void isSum()
	{
		while(copy!=0)
		{
			int rem=copy%10;
			sum=sum+(int)Math.pow(rem,count);
			copy/=10;
		}
	}
	void checkArmstrong()
	{
		System.out.println(sum==copy1?"Armstrong":"not Armstrong");
	}
}
		
		
			
	