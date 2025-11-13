class Inheri
{
	public static void main(String [] args)
	{
	
		Child child=new Child();
		child.isArm();
	}
}
class Child extends Parent
{	
	Child()
	{
		super(153);
		
	}
			
}
class Parent
{
	int number;
	Parent(int number)
	{
		this.number=number;
	}
	void isArm()
	{
		System.out.println(number);
		int temp=number;
		int count=0,sum=0,temp1=number;
		while(number!=0)
		{
			count++;
			number/=10;
		}
		while(temp!=0)
		{
			sum=sum+(int)(Math.pow(temp%10,count));
			temp/=10;
		}
		if(sum==temp1)
			System.out.println("Armstrong");
		else
			System.out.println("not Armstrong");
	}
}


	