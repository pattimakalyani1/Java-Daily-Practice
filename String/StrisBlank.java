class StrisBlank
{
	public static void main(String [] args)
	{
		String s="hello world";
		String s1="";
		String s2=" ";
		String s3=null;
		System.out.println(s.isBlank());
		System.out.println(s1.isBlank());
		System.out.println(s2.isBlank());
		System.out.println(s3.isBlank());

	}
}


/*


false
true
true
nullException


*/


class StrisBlank1
{
	public static void main(String [] args)
	{
		String s="\n\t";
		System.out.println(s.isBlank());
	}
}

//true

