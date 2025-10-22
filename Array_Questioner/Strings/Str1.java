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
