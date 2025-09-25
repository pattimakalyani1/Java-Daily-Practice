class Sample3
{
	public static void main(String [] args)
	{
		Employee employee=new Employee();
		employee.id=89;
		employee.name="kalyani";
		employee.bs=10000;employee.hra=7.5;employee.da=7.2;employee.ta=6.4;
		employee.calTotalSalary();
		employee.printData();
	}
}
class Employee
{
	int id,bs;
	String name;
	double hra,ta,da,total_salary;
	void calTotalSalary()
	{
		hra=hra/100*bs;
		ta=ta/100*bs;
		da=da/100*bs;
		total_salary=bs+hra+ta+da;
	}
	void printData()
	{
		System.out.println(id+" "+name+" "+total_salary);
	}
}
	