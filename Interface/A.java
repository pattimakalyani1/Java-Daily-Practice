interface A
{
	int a=4;
	public static string location()
	{
		return "vij";
	}
}
class B implements A
{
	a=10;
	public static void main(String [] args)
	{
		System.out.println(A.a+" "+A.location());
	}
}


//A.java:11: error: <identifier> expected
        a=10;
         ^
1 error