class Method
{
	public static void main(String [] args)
	{
		
		Demo d=new Demo();
		d.calAdd(10);
		
	}
	
}
class Demo
{
	/*void calAdd(int x)		
	{
		System.out.println("integer");
	}*/
	void calAdd(float x)		
	{
		System.out.println("float");
	}
	void calAdd(double x)		
	{
		System.out.println("double");
	}
	void calAdd(long  x)		
	{	
		System.out.println("long");
	}
	/*void calAdd(short x)		
	{
		System.out.println("short");
	}*/
}