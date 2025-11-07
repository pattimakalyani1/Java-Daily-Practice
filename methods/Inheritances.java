class Inheritances
{
	public static void main(String [] args)
	{
	
		Child child=new Child();
		System.out.println(child.printInfo());
	}
}
class Child extends Parent
{
	Child()
	{
		System.out.println("I am child class constructor");
	}
}
class Parent
{
	double height;
	Parent(double height)
	{
		height=78.9;
		System.out.println("I am Parent class constructor");
	}
	Double printInfo()
	{
		return height;
	}
}


