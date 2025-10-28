class StrendsWith
{
	public static void main(String [] args)
	{
		String s="hello world";
		String s1=null;
		System.out.println(s.endsWith("world"));
		System.out.println(s.endsWith("hello"));
		System.out.println(s.endsWith("ld"));
		System.out.println(s.endsWith("rld"));
		System.out.println(s.endsWith("test"));
		System.out.println(s1.endsWith("test"));//nullException

	}
}

/*

true
false
true
true
false

*/


class Strcontains
{
	public static void main(String [] args)
	{
		String s="hello world";
		System.out.println(s.contains("h"));
		System.out.println(s.contains("x"));
		System.out.println(s.contains("world"));
		System.out.println(s.contains("World"));
	}
}

/*


true
false
true
false


*/
















