class StrAddress
{
	public static void  main(String [] args)
	{
		String s1="hi";
		System.out.println(s1+" address: "+System.identityHashCode(s1));
		String s2="hello";
		System.out.println(s2+" address: "+System.identityHashCode(s2));
	}
}

/*
hi address: 798154996
hello address: 1418481495

*/


class StrAddress1
{
	public static void  main(String [] args)
	{
		String s1="hello";
		System.out.println(s1+" address: "+System.identityHashCode(s1));
		String s2="hello";
		System.out.println(s2+" address: "+System.identityHashCode(s2));
	}
}


/*

hello address: 798154996
hello address: 798154996

*/

class StrAddress2
{
	public static void  main(String [] args)
	{
		String s1= new String("all");
		System.out.println(s1+" address: "+System.identityHashCode(s1));
		String s2=new String("all");
		System.out.println(s2+" address: "+System.identityHashCode(s2));
	}
}

/*

all address: 798154996
all address: 1418481495

*/

