class Sample4
{
	public static void main(String [] args)
	{
		Student student=new Student();
		student.m1=12;
		student.m2=10;student.m3=14;
		 int total=student.calTotal();
		double per=total/60.0*100;
		System.out.println(total+" "+per);
	}
}
class Student
{
	int m1,m2,m3;
	int calTotal()
	{
		return m1+m2+m3;
	}
}


class Sample41
{
	public static void main(String [] args)
	{
		Students student1=new Students();
		student1.m1=12;
		student1.m2=10;student1.m3=14;
		System.out.println(student1.calTotal());
		student1.calPer();
	}
}
class Students
{
	int m1,m2,m3,total;
	double per;
	int calTotal()
	{
		total=m1+m2+m3;
		return total;
	}
	void calPer()
	{
		per=total/60.0*100;
		System.out.println(per);
	}
}