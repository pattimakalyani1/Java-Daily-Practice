class Strtrim
{
	public static void main(String [] args)
	{
		String s=" hello world ";
		String res=s.trim();
		System.out.println(s);
		System.out.println(res);
	}
}


/*

 hello world
hello world

*/



class Strtrim1
{
	public static void main(String [] args)
	{
		String s="    ";
		System.out.println(s.trim().isEmpty());
	}
}


/*

true

*/


class Strtrim2
{
	public static void main(String [] args)
	{
		String s=" hello world ";
		System.out.println(s.trim().toUpperCase());
		
	}
}

/*

HELLO WORLD

*/


class Strtrim3
{
	public static void main(String [] args)
	{
		String s=" HELLO WORLD ";
		System.out.println(s.trim().toLowerCase());
		
	}
}



class Strtrim4
{
	public static void main(String [] args)
	{
		String s=null;
		System.out.println(s.trim());
	}
}

/*


Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.trim()" because "<local1>" is null
        at Strtrim4.main(Strtrim.java:


*/



