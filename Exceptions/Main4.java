//multiplr catch blocks	
import java.util.Scanner;
class Main4
{
	public static void main(String [] args)
	{
		try{
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int []n=new int[a];
			System.out.println(10/a);
		}catch(ArithmeticException a)
		{
			System.out.println("I am in a");
		}
		catch(NullPointerException np)
		{
			System.out.println("I am in np");
		}
		catch(NegativeArraySizeException ne)
		{
			System.out.println(" I am in ne");
		}
	}
}

/*

0
i am in a

*/


class Main5
{
	public static void main(String [] args)
	{
		try{
			try{
	
				String  s=null;
				System.out.println(s.toUpperCase());
			}
			catch(Exception e)
			{
				System.out.println("i am in np");
			}
			
			System.out.println(10/0);
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


/*

i am in np
i am in e

*/
	

	
		
	