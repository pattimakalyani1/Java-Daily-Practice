class Main3//implicit type caste
{
	public static void main(String [] args)
	{
		byte b=54;
		Main3 main=new Main3();
		main.calM1(b);
	}
	void calM1(short b)
	{
		System.out.println("in short");
	}
	void calM1(float b)
	{
		System.out.println("in float");
	}
	void calM1(int b)
	{
		System.out.println("in int");
	}
	void calM1(long b)
	{
		System.out.println("in long");
	}
	void calM1(double b)
	{
		System.out.println("in double");
	}
}

class Main31//explicit type caste                                                                 
{
	public static void main(String [] args)
	{
		byte b=54;
		Main31 main=new Main31();
		main.calM1((double)b);
	}
	void calM1(short b)
	{
		System.out.println("in short");
	}
	void calM1(float b)
	{
		System.out.println("in float");
	}
	void calM1(int b)
	{
		System.out.println("in int");
	}
	void calM1(long b)
	{
		System.out.println("in long");
	}
	void calM1(double b)
	{
		System.out.println("in double");
	}
}



	