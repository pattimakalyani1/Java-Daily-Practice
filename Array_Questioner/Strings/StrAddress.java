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


class StrAddress3
{
	public static void  main(String [] args)
	{
		String s1="hello all";
		String s2="hello all";
		String s3="hello ";
		s3=s3+"all";
		System.out.println(s1+" address: "+System.identityHashCode(s1));
		System.out.println(s2+" address: "+System.identityHashCode(s2));
		System.out.println(s3+" address: "+System.identityHashCode(s3));
	}
}


/*

hello all address: 140435067
hello all address: 140435067
hello all address: 303563356

*/	

class StrAddress4
{
	public static void  main(String [] args)
	{
		String s1="hello all";
		String s2="hello all";
		String s3="haii";
		String s4="haii";
		s3=s3+"all";
		s4=s4+"all";

		System.out.println(s1+" address: "+System.identityHashCode(s1));
		System.out.println(s2+" address: "+System.identityHashCode(s2));
		System.out.println(s3+" address: "+System.identityHashCode(s3));
		System.out.println(s4.intern()+" address: "+System.identityHashCode(s4));
	}
}

/*

hello all address: 140435067
hello all address: 140435067
haiiall address: 303563356
haiiall address: 135721597
*/



class StrAddress6
{
	public static void  main(String [] args)
	{
		String s1="hello all";
		String s2="hello all";
		String s3="hello ";
		s3=s3+"all";
		//s3=s3.intern();
		System.out.println(s1+" address: "+System.identityHashCode(s1));
		System.out.println(s2+" address: "+System.identityHashCode(s2));
		System.out.println(s3.intern()+" address: "+System.identityHashCode(s3));
	}
}

/*

hello all address: 140435067
hello all address: 140435067
hello all address: 140435067

*/


class StrAddress7
{
	public static void  main(String [] args)
	{
		String s1="hello all";
		String s2=new String("hello all");
		String s3=new String("hello ");
		s3=s3+"all";
		//s3=s3.intern();
		System.out.println(s1+" address: "+System.identityHashCode(s1));
		System.out.println(s2+" address: "+System.identityHashCode(s2));
		System.out.println(s3+" address: "+System.identityHashCode(s3));
	}
}

/*

hello all address: 140435067
hello all address: 303563356
hello all address: 135721597

*/


class StrAddress8
{
	public static void  main(String [] args)
	{
		String s1="hello all";
		String s2=new String("hello all");
		String s3=new String("hello ");
		s3="hello all";
		//s3=s3.intern();
		System.out.println(s1+" address: "+System.identityHashCode(s1));
		System.out.println(s2+" address: "+System.identityHashCode(s2));
		System.out.println(s3+" address: "+System.identityHashCode(s3));
	}
}

/*

hello all address: 798154996
hello all address: 1418481495
hello all address: 798154996

*/



