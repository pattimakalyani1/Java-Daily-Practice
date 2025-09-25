class Model2
{
	public static void main(String [] args)
	{
		Sample sample =new Sample();
		System.out.println(sample.isDouble());
		System.out.println(sample.isInteger());
		System.out.println(sample.isBoolean());
                float f=sample.isFloat();
		System.out.println(f);
		sample.printData();

	
	}
}


class Sample
{
	void printData()
	{
		System.out.println("hello");
		return;
	}
	double isDouble()
	{
		return 37.87;
	}
	int isInteger()
	{
		return 87;
	}
	boolean isBoolean()
	{
		return true;
	}
	float isFloat()
	{
		return 67.76f;
	}
}