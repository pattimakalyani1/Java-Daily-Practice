class Student
{
	int Sid;
	String sname,email;
	student(int Sid,String sname,String email)
	{
		this.Sid=Sid;
		this.sname=sname;
		this.email=email;
	}
		
	public static void main(String [] args)
	{
		Main main=new Main(1,"kavya","kavya@gmail.com");
		System.out.println(main.printData());
		
	}
	String printData()
	{
		return roll+" "+sname+" "+email;
	}
}
