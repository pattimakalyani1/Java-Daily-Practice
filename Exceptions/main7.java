//creating custom unchecked exception 
 InsufficentBalException extends RuntimeException
{
	public InsufficentBalException(String s)
	{
		super(s);
	}
	
}

class Main
{
	public static void main(String [] args)
	{
		throw new InsufficentBalException("balance is not efficient");
	}
}


/*

Exception in thread "main" InsufficentBalException
        at Main.main(Main7.java:14)

*/

//custom unchecked exception is handled using try and catch block
class Main1
{
	public static void main(String [] args)
	{
		try{
			throw new InsufficentBalException("balance is not efficient");
		}catch(InsufficentBalException ia)
		{
			System.out.println("exception handled");
		}
	}
}

//exception handled


//predfined exceptions are throw manually using throw keyword
class  Main2
{
	public static void main(String [] args)
	{
		throw new ArithmeticException();
	}
}

/*

Exception in thread "main" java.lang.ArithmeticException
        at Main2.main(Main7.java:48)


*/



