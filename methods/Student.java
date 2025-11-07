//instance variables
class Student
{
	int Sid;
	String sname,email;
	Student(int Sid,String sname,String email)
	{
		this.Sid=Sid;
		this.sname=sname;
		this.email=email;
	}
		
	public static void main(String [] args)
	{
		Student student=new Student(1,"kavya","kavya@gmail.com");
		System.out.println(student.printData());
		Student student1=new Student(2,"suvarna","suvarna@gmail.com");
		System.out.println(student1.printData());

		
	}
	String printData()
	{
		return Sid+" "+sname+" "+email;
	}
}


/*

1 kavya kavya@gmail.com
2 suvarna suvarna@gmail.com


*/

//methods using this keyword
class Student1
{
	int Sid;
	String sname,email;
	void student3()
	{
		this.stu();
		System.out.println("i am student method");
	}
	void stu()
	{
		System.out.println("i am stu method");
	}		
	public static void main(String [] args)
	{
		Student1 student=new Student1();
		student.student3();
		
		
	}
}


/*

 am stu method
i am student method

*/



class Student2
{
	int Sid;
	String sname,email;
	void student3()
	{
		stu();
		System.out.println("i am student method");
	}
	void stu()
	{
		System.out.println("i am stu method");
	}		
	public static void main(String [] args)
	{
		Student2 student=new Student2();
		student.student3();
		
		
	}
}



//constrctor


/*class Main
{
	int id;String name;
	Main()
	{
		this();
		System.out.println("i am default constructor");
	}
	Main(int id,String name)
	{
		System.out.println("i am parameter constructor");
	}
	
	public static void main(String [] args)
	{
		Main main=new Main();
	}
}



Student.java:102: error: recursive constructor invocation
                this();
                ^
1 error

*/

/*class Main
{
	int id;String name;
	Main()
	{
		this(10);

		System.out.println("i am default constructor");
	}
	Main(int id,String name)
	{
		System.out.println("i am parameter constructor");
	}
	Main(int id)
	{
		System.out.println("i am parameter constructor with in parameter");
	}

	
	public static void main(String [] args)
	{
		Main main=new Main();
	}
}




Student.java:131: error: call to this must be first statement in constructor
                this(10,"hello");
                    ^
1 error

*/


/*
class Main
{
	int id;String name;
	Main()
	{
		this(10);

		System.out.println("i am default constructor");
	}
	Main(int id)
	{
		System.out.println("i am parameter constructor");
	}
	Main(int id)
	{
		System.out.println("i am parameter constructor with in parameter");
	}

	
	public static void main(String [] args)
	{
		Main main=new Main();
	}
}

Student.java:174: error: constructor Main(int) is already defined in class Main
        Main(int id)
        ^
1 error

*/



/*

class Main
{
	int id;String name;
	Main()
	{
		System.out.println("i am default constructor");
			this(10);
	}
	Main(int id)
	{
		System.out.println("i am parameter constructor");
	}
	public static void main(String [] args)
	{
		Main main=new Main();
	}


}

Student.java:202: error: call to this must be first statement in constructor
                        this(10);
                            ^
1 error

*/


//chaining
/*
class Main
{
	int id;String name;
	Main()
	{
		this(10);
		System.out.println("i am default constructor");
	}
	Main(int id,String name)
	{
		System.out.println("i am parameter constructor");
	}
	Main(int id)
	{
		this(11,"hrllo");
		System.out.println("i am parameter constructor with int");
	}

	
	public static void main(String [] args)
	{
		Main main=new Main();
	}
}


i am parameter constructor
i am parameter constructor with int
i am default constructor

*/


class Main
{
	int id;String name;
	Main()
	{
		this(10);
		this(11,"hrllo");
		System.out.println("i am default constructor");
	}
	Main(int id,String name)
	{
		System.out.println("i am parameter constructor");
	}
	Main(int id)
	{
		
		System.out.println("i am parameter constructor with int");
	}

	
	public static void main(String [] args)
	{
		Main main=new Main();
	}
}


