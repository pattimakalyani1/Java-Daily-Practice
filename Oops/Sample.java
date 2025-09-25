class Sample
{
	public static void main(String [] args)
	{
		Student student=new Student();
		student.printData();
		System.out.println(student.name+"  "+student.number);
	}
}
class Student
{
	int number;//instance variables;
	String name;
	void printData()
	{
		System.out.println(number+" "+name);
	}
}

//0 null


/*class Students
{
	void printData()
	{
		int number;
		String name;
		System.out.println(number+" "+name);
	}
}

C:\Users\patti\OneDrive\Desktop\core java practice\Oops>javac Sample.java
Sample.java:26: error: variable number might not have been initialized
                System.out.println(number+" "+name);
                                   ^
Sample.java:26: error: variable name might not have been initialized
                System.out.println(number+" "+name);

*/


/*(class Students
{
	void printData()
	{
		int number;
		String name;
		System.out.println(number+" "+name);
	}
	void printData1()
	{
		number=number+1;
	}
}


Sample.java:52: error: cannot find symbol
                number=number+1;
                ^
  symbol:   variable number
  location: class Students
Sample.java:52: error: cannot find symbol
                number=number+1;
                       ^
  symbol:   variable number
  location: class Students
2 errors

*/