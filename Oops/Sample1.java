class StudentApplication
{
	public static void main(String [] args)
	{
		Student student1=new Student();
		student1.roll=1;
		student1.name="kalyani";
		student1.section='A';
		student1.m1=94;
		student1.m2=90;	
		student1.m3=95;
		student1.max_marks=100;
		student1.calTotal();
		student1.calPercen();
		student1.printData();
		Student student2=new Student();
		student2.roll=2;
		student2.name="kalyan";
		student2.section='B';
		student2.m1=89;
		student2.m2=90;	
		student2.m3=78;
		student2.max_marks=100;
		student2.calTotal();
		student2.calPercen();
		student2.printData();

	
		
	}
}
class Student
{
	int roll,m1,m2,m3;
	String name;
	char section;
	double max_marks,total,percen;
	void calTotal()
	{
		total=m1+m2+m3;
	
	}
	void calPercen()
	{
		percen=total/max_marks*100;
	}
	void printData()
	{
		System.out.println(roll+" "+name+" "+section+" "+m1+" "+m2+" "+m3+" "+total+" "+percen+" ");
	}
}	