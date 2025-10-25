class StrstartsWith
{
	public static void main(String [] args)
	{
		String s="hello world";
		System.out.println(s.startsWith("hello"));
	}
}

//true


class StrstartsWith1
{
	public static void main(String [] args)
	{
		String s="hello world";
		System.out.println(s.startsWith("world"));
	}
}

//false

class StrstartsWith2
{
	public static void main(String [] args)
	{
		String s="hello world";
		System.out.println(s.startsWith("world",6));
	}
}

//true


class StrstartsWith3
{
	public static void main(String [] args)
	{
		String s="hello world";
		System.out.println(s.startsWith("Hello"));
	}
}


//false


class StrstartsWith4
{
	public static void main(String [] args)
	{
		String s="hello world";
		System.out.println(s.startsWith(""));
	}
}

//true.




class StrstartsWith5
{
	public static void main(String [] args)
	{
		String s="hello world";
		System.out.println(s.startsWith(null));
	}
}

//nullpoint exception
