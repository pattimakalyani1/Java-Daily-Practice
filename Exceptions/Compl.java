import java.util.Scanner;
class Compl
{
	public static void  main(String [] args)throws EmailAlreadyExistException
	{
		Scanner sc=new Scanner(System.in);
		String a="kalyani@gmail.com";
		System.out.println("enter email");
		String b=sc.next();
		
		if(a.equals(b))
		{
		
			throw new EmailAlreadyExistException("Email aleady existed");
		}
		else
			System.out.println("successful email");
	}
}

class EmailAlreadyExistException extends Exception
{
	public EmailAlreadyExistException()
	{
		super();
	}

	public EmailAlreadyExistException(String s)
	{
		super(s);
	}
}



//using try
class Compl1
{
	public static void  main(String [] args)throws EmailAlreadyExistException
	{
		String a="kalyani@gmail.com";
		try{
		
			if(a.equals("kalyani@gmail.com"))
			{
		
				throw new EmailAlreadyExistException("Email aleady existed");
			}
			else
				System.out.println("successful email");
		}
		catch(EmailAlreadyExistException e)
		{
			System.out.println("exception handeld");
		}

	}
}




	