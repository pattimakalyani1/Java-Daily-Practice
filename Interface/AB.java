interface A
{
	int a=4;
	public static String location()
	{
		return "hyd";
	}
}

class B implements A
{	
	public static void main(String [] args)
	{
		System.out.println(A.a+" "+A.location());
	}
}


//4 hyd

