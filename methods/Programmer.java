//single Inheritances
class Employee
{
	int id;
	String name,gender;
	double mobile;
	Employee(int id,String name,String gender,double mobile)
	{
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.mobile=mobile;
	}
	double getSalary()
	{
		return 50000;
	}
	String printData()
	{
		return id+" "+name+" "+gender+" "+mobile;
	}
}
class Programmer extends Employee
{
	String role,technology,location;
	int project_id;

	Programmer(String role,int project_id,String technology,String location)
	{
		super(1,"kalyani","female",830978675);
		this.role=role;
		this.project_id=project_id;
		this.technology=technology;
		this.location=location;
	}
	String printData()
	{
		System.out.println("employee details: "+super.printData());
		return role+" "+project_id+" "+technology+" "+location;
	}
	double getBonus()
	{
		
		return 500;
	}
	
	public static void main(String [] args)
	{
		Programmer programmer=new Programmer("developer",14678,"Java","hyd");
		System.out.println(programmer.printData());
		System.out.println("salary:"+programmer.getSalary());
		System.out.println("Bonus:"+programmer.getBonus());
	}
}
	

/*

1 kalyani female 8.30978675E8
developer 14678 Java hyd
50000.0
500.0

*/	
	
		

		
	