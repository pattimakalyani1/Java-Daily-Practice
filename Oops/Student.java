class Student
{
	void printData()
	{
		System.out.println("hi all this is kalyani");
	}
	void firstMethod()
	{
		System.out.println("first method");
	}
	void secondMethod()
	{
		System.out.println("second method");
	}
	void thirdMethod()
	{
		System.out.println("third method");
	}
	void fourMethod()
	{
		System.out.println("four method");
	}

}

class Main
{
	public static void main(String [] args)
	{
		Student student1;
		student1=new Student();
		student1.printData();
		Student student2;
		student2=new Student();
		student2.firstMethod();
		Student student3;
		student3=new Student();
		student3.secondMethod();
		Student student4;
		student4=new Student();
		student4.thirdMethod();
		Student student5;
		student5=new Student();
		student5.fourMethod();



		
		System.out.println("after method");
	}
}