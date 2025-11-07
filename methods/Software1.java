class Employee extends Person
{
	int id;
	String name,gender;
	long mobile;
	
	Employee(int id,String name,String gender,long mobile)
	{
		super("backend","java","hyd",1465677);
		this.id=id;this.name=name;this.gender=gender;this.mobile=mobile;
	}
	
	String printData()
	{
		System.out.println(super.printData());
		return id+" "+name+" "+gender+" "+mobile;
	}
	
	double getSalary()
	{
		return 50000;
	}
}

class Person 
{
	String role,technology,location;
	int project_id;
	
	Person(String role,String technology,String location,int project_id)
	{
		
		this.role=role;
		this.technology=technology;
		this.location=location;
		this.project_id=project_id;
	}
	
	String printData()
	{
		
		return role+" "+technology+" "+location+" "+project_id;
	}
	
	double getBonus()
	{
		return 500;
	}
}

class Developer extends Employee
{
	String role,projects,location;
	int recruitment;
	
	Developer(String role,String location)
	{
		super(1,"kalyani","female",34567565l);
		this.role=role;
		this.location=location;
		
	}

	String printData()
	{
		System.out.println(super.printData());
		return role+" "+location;
	}
	
}

class Software1
{
	public static void main(String [] args)
	{

		Developer developer=new Developer("java","vij");
		System.out.println(developer.printData());
		System.out.println(developer.getSalary());
		//System.out.println(developer.getBonus());
	}
}


