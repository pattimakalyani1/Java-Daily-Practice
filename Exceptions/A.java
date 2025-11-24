class A
{
	public static void main(String [] args)
	{
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(" I am in e");
		}
		finally{
			System.out.println("I am in finally ");
		}
	}
}

/*

 I am in e
I am in finally

*/



class B
{
	public static void main(String [] args)
	{
		try{
			System.out.println(10/5);
		}
		catch(ArithmeticException e)
		{
			System.out.println(" I am in e");
		}
		finally{
			System.out.println("I am in finally ");
		}
	}
}




class C
{
	public static void main(String [] args)
	{
		System.out.println(call());
	}
	
	public static String call()
	{
		try{
			System.out.println(10/0);
			System.out.println("try without return");
			return "try";
		}
		catch(ArithmeticException e)
		{
			System.out.println(" i am in vcatch");
			return "catch";
		}
		finally{
			return "finally";
		}
	}

}






