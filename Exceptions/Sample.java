class Sample
{
	public static void main(String [] args)	
	{
		try{
			System.out.println(10/0);
			System.out.println("try");
		 }catch(ArithmeticException a)
		{
			System.out.println(" i am in a");
		}
		finally{
			System.out.println(" i am in finnally");
		}
	}
}

/*

 i am in a
 i am in finnally

*/


class Sample1
{
	public static void main(String [] args)	
	{
		try{
			System.out.println(10/0);
			System.out.println("try");
		 }catch(ArithmeticException a)
		{
			System.out.println(" i am in a");
		}
		catch(Exception e){
			System.out.println(" i am in e");
		}
	}
}

// i am in a



class Sample2
{
	public static void main(String [] args)	
	{
		try{
			System.out.println(10/0);
			System.out.println("try");
		 }catch(Exception e)
		{
			System.out.println(" i am in e");
		}
		catch(ArithmeticException ae){
			System.out.println(" i am in ae");
		}
	}
}


/*


Sample.java:58: error: exception ArithmeticException has already been caught
                catch(ArithmeticException ae){

*/




