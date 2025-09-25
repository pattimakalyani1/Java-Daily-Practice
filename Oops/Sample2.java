class Student
{
	int number;
	String name;
	void printData()
	{
		System.out.println(name+" "+number);
	}
}


class Sample2
{
	public static void main(String [] args)
	{
		Student student1=new Student();
		student1.name="kalyani";
		student1.number=1;
		student1.printData();
		Student student2=new Student();
		student2.printData();
	}
}