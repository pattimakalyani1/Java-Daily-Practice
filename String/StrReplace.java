class StrReplace
{
	public static void main(String [] args)
	{
		String s="banana";
		System.out.println(s.replace('a','e'));
		String res=s.replace('a','o');
		System.out.println(res);
		
	
	}
}

/*

benene
bonono

*/

//replacing a substrings
class StrReplace1
{
	public static void main(String [] args)
	{
		String s="i like python";
		String res=s.replace("python","java");
		System.out.println(res);
	}
}


/*

i like java

*/


// case sensitive
class StrReplace2
{
	public static void main(String [] args)
	{
		String s="i like python PYThon PYTHON";
		String res=s.replace("python","java");
		System.out.println(res);
	}
}


/*


i like java PYThon PYTHON


*/

//replaceAll() and replaceFirst() used for reg Expression
class StrReplace3
{
	public static void main(String [] args)
	{
		String s="a12b34";
		String res=s.replaceAll("[0-9]","");
		System.out.println(res);
	}
}

/*

ab

*/


class StrReplace4
{
	public static void main(String [] args)
	{
		String s="a1b2c3";
		String res=s.replaceFirst("[0-9]","");
		System.out.println(res);
	}
}


/*

ab2c3

*/


class StrReplace5
{
	public static void main(String [] args)
	{
		String s="a12b34";
		String res=s.replaceAll("[0-9]","").replace('a','x');
		System.out.println(res);
	}
}

/*

xb

*/

class StrReplace6
{
	public static void main(String [] args)
	{
		String s="a1b2c3";
		String res=s.replaceFirst("[0-9]","").replace('b','y');
		System.out.println(res);
	}
}

/*

ay2c3

*/

class StrReplace7
{
	public static void main(String [] args)
	{
		String s="i like python";
		String res=s.replace("python","java").replace("like","not like");
		System.out.println(res);
	}
}

/*

i not like java

*/



