/*
//instance variables using super keyword
class Main
{
	public static void main(String [] args)
	{
		Child child=new Child();
		System.out.println(child.printData());
	}
}
class Child extends Parent
{
	int x,y;
	Child()
	{
		x=10;y=20;
	}
	String printData()
	{
		return x+" "+y;
	}
}
class Parent
{
	int x,y;
	Parent()
	{
		x=100;y=300;
	}
	String printData()
	{
		return x+" "+y;
	}
}

//10 20

*/


/*
class Main
{
	public static void main(String [] args)
	{
		Child child=new Child();
		System.out.println(child.printData());
	}
}
class Child extends Parent
{
	int x,y;
	Child()
	{
		x=10;y=20;
	}
	String printData()
	{
		return super.x+" "+super.y; nn
	}
}
class Parent
{
	int x,y;
	Parent()
	{
		x=100;y=300;
	}
	String printData()
	{
		return x+" "+y;
	}
}

//100 300


*/


//calss methods using super keyword
class Main
{
	public static void main(String [] args)
	{
		Child child=new Child();
		System.out.println(child.printData());
	}
}
class Child extends Parent
{
	int x,y;
	Child()
	{
		x=10;y=20;
	}
	String printData()
	{
		System.out.println(super.printData()); 
		return this.x+" "+this.y;
	}
}
class Parent
{
	int x,y;
	Parent()
	{
		x=100;y=300;
	}
	String printData()
	{
		return this.x+" "+this.y;
	}
}
