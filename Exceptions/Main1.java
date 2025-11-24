class Main1
{
	public static void main(String [] args)
	{
		m1();
	}
	public static void m1()
	{
		m2();
	}
	public static void m2()
	{
		try{
			System.out.println(10/0);
		}catch(ArithmeticException e)
		{
			System.out.println("I am in catch block");
		}
	}
}


// i am in catch block

class Main2
{
	public static void main(String [] args)
	{
		m1();
	}
	public static void m1()
	{
		m2();
		try{
			System.out.println(10/0);
		}catch(ArithmeticException e)
		{
			System.out.println("I am in catch block");
		}

	}
	public static void m2()
	{
		System.out.println("m2");
	}
}

//m2
//i am in catch block

class Main3
{
	public static void main(String [] args)
	{
		m1();
		try{
			System.out.println(10/0);
		}catch(ArithmeticException e)
		{
			System.out.println("I am in catch block");
		}


	}
	public static void m1()
	{
		m2();
	}
	public static void m2()
	{
		
	}
}

// i am in catch block

	



