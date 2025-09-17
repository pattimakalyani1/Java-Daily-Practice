class design
{
	public static void main(String [] args)
	{
	double salary;
	String design="developer";
	int exp=6;
	double bonus;
	double final_salary,allowances;
	String location="metro city";
	double tax;
	if(design=="manager")
	{
		salary=70000;
	}
	else if(design=="developer")
	{
		salary=50000;
	}
	else if(design=="tester")
	{
		salary=40000;
	}
	else
	{
		salary=30000;
	}
	if(exp>5)
	{
		bonus=10000;
	}
	else
	{
		bonus=0;
	}
	if(design=="developer" && exp>3)
	{

		System.out.println("eligible for promotion");
	}	else
	{
		System.out.println("not eligible for promotion");
	}
	if(location=="metro city")
	{
		allowances=5000;
	}
	else
	{
		allowances=0;
	}
	final_salary=salary+bonus+allowances;
	System.out.println("final salary before tax: "+final_salary);
	if(final_salary>100000)
	{
		tax=10.0/100*final_salary;
	}
	else if (final_salary>50000 && final_salary<100000)
	{
		tax=5.0/100*final_salary;
	}
	else
	{
		tax=0;
	}
	final_salary=final_salary-tax;
        System.out.println("final salary after tax : "+final_salary);
}
}