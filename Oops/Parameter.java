class Parameter
{
	void calPrime()
	{
		System.out.println("void calPrime");
	}
	void calPrime1(int num)
	{
		System.out.println("void calPrime(int num)");

	}
	int calPalin()
	{
		return 46;
	}
	int calPalin2(int num)
	{
		return 56;
	}
	public static void main(String [] args)
	{
	Parameter parameter=new Parameter();
	parameter.calPrime();
	parameter.calPrime1(46);
	System.out.println(parameter.calPalin());
	System.out.println(parameter.calPalin2(78));
	}
}