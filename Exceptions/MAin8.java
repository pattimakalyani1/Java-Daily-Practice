class Main
{
	public static void main(String [] args)
	{
		throw new EmailAlreadyExistException("email alredy existed");
	}
}

class EmailAlreadyExistException extends RuntimeException
{
	public  EmailAlreadyExistException(String s)
	{
		super(s);
	}
}


/*

Exception in thread "main" EmailAlreadyExistException: email alredy existed
        at Main.main(Main8.java:5)

*/