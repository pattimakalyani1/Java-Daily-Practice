class Arm
{
	public static void main(String [] args)
	{
		Armm arm=new Armm();
		arm.num=153;
		arm.temp=arm.num;
		arm.calCount();
		int result=arm.sumOfPower();
		//System.out.println(result);
		System.out.println(result==arm.temp?"Armstrong":"not armstrong");

		
	}
}

class Armm
{
       int num,count,sum,temp;
	void calCount()
	{
		while(num!=0)
		{
			count++;
			num/=10;
		}
	}
	int sumOfPower()
	{
		while(num!=0)
		{
			System.out.println(count);
			sum=sum+(int)Math.pow((num%10),count);
			num/=10;
		}
		return sum;
	}
	
}