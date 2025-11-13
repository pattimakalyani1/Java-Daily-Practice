//method hiding
class Child extends Parent
{
	public static void main(String [] arg)
	{
		//Child child=new Child();
		//child.m2();
		Parent parent=new Child();
		parent.m2();
				
		
	}
	void m1()
	{
		System.out.println("non static m1 method in child");
	}
	 static void m2()
	{
		System.out.println("static m2 method in child");
	}
}
class Parent 
{
	void m1()
	{
		System.out.println("non static m1 method in parent");
	}
	 static void m2()
	{
		System.out.println("static m2 method in parent");
	}
}


//static m2 method in parent	
		
	