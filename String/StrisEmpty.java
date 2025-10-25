class StrisEmpty
{
	public static void main(String [] args)
	{
		String s="";
		System.out.println(s.isEmpty());
	}
}

//true


class StrisEmpty1
{
	public static void main(String [] args)
	{
		String s=" ";
		System.out.println(s.isEmpty());
	}
}

//false

class StrisEmpty2
{
	public static void main(String [] args)
	{
		String s=" hello";
		System.out.println(s.isEmpty());
	}
}

//false

/*class StrisEmpty3
{
	public static void main(String [] args)
	{
		String s=null;
		System.out.println(s.isEmpty());
	}
}

*/

//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isEmpty()" because "<local1>" is null
       // at StrisEmpty3.main(StrisEmpty.java:40)



class StrisEmpty4
{
	public static void main(String [] args)
	{
		String s=" ";
		System.out.println(s.trim().isEmpty());
	}
}

//true
