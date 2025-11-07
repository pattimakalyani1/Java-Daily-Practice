class Constructor
{
	public static void main(String [] args)
	{
		
		Demo d=new Demo();
		System.out.println(d.roll);
		System.out.println(d.name);
		System.out.println(d.email);
		Demo di=new Demo(10);
		System.out.println(di.roll);
		System.out.println(di.name);
		System.out.println(di.email);
				
		
	}
	
}
class Demo
{
	int roll;
	String name,email;
	Demo()
	{
		roll=1;
		name="kalyani";
		email="kalyani@gmail.com";
	}
	Demo(int x)
	{
		roll=2;
		name="kavya";
		email="kavya@gmail.com";
	}

}