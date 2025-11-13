//static block & instance block
class Child
{
	static
	{
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}

	public static void main(String [] args)
	{
		System.out.println("main method");

	}
}
6

/*

static block
main method

*/

class Child1
{
	static
	{
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
	public static void main(String [] args)
	{
	
		System.out.println("main method");		
		Child1 child1=new Child1();


	}
}

/*

static block
main method
instance block

*/


class Child12
{
	static
	{
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
	{
		System.out.println("instance block 2");
	}
	public static void main(String [] args)
	{
	
		System.out.println("main method");		
		Child12 child12=new Child12();


	}
}

/*

static block
main method
instance block
instance block1

*/


class Main
{
	 static int a,b;
	static
	{
		a=15;b=18;
		System.out.println(a+" "+b);
	}
	public static void main(String [] args)
	{
	}
}

//15 18



class Main1
{
	static int x;
	static
	{
		 x=10;
		if(x>=0)
			System.out.println("i am positive");
		else
			System.out.println("i am negative");
	}
	public static void main(String [] args)
	{
	}
}


//i am positive

	




	