class One
{
	public static void main(String [] args)
	{
		Child child=new  Child();
	}
}
class Child extends Parent
{
	Child()
	{
		super(10);
		System.out.println("i am child class constructor");
	}
	Child(int x)
	{
		
		System.out.println("i am child class Parameter constructor");
	}
}
class Parent
{
	Parent()
	{
	}
	Parent(int x)
	{
		System.out.println("i am parent class parameter constructor");
	}
}


//i am parent class parameter constructor
//i am child classparameter constructor