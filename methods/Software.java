//hierarchical Inheritance
class Employee
{
	int id;
	String name,gender;
	long mobile;
	int salary;
	
	Employee(int id,String name,String gender,long mobile,int salary)
	{
		this.id=id;this.name=name;this.gender=gender;this.mobile=mobile;this.salary=salary;
	}
	
	String printData()
	{
		return id+" "+name+" "+gender+" "+mobile;
	}
	
	double getSalary()
	{
		return salary;
	}
}

class Programmer extends Employee
{
	String role,technology,location;
	int project_id;
	
	Programmer(String role,String technology,String location,int project_id)
	{
		super(1,"kalyani","female",34567565l,45678);
		this.role=role;
		this.technology=technology;
		this.location=location;
		this.project_id=project_id;
	}
	
	String printData()
	{
		System.out.println(super.printData());
		return role+" "+technology+" "+location+" "+project_id;
	}
	
	double getBonus()
	{
		return 500;
	}
}

class HR extends Employee
{
	String role,projects,location;
	int recruitment;
	
	HR(String role,String projects,String location,int recruitment)
	{
		super(2,"suvarna","male",23456788l,67977);
		this.role=role;
		this.projects=projects;
		this.location=location;
		this.recruitment=recruitment;
	}

	String printData()
	{
		System.out.println(super.printData());
		return role+" "+projects+" "+location;
	}
	
	String getStatus()
	{
		return "no of recuritments: "+recruitment;
	}
}

class Tester extends Employee
{
	String role,technology,location,company;
	
	Tester(String role,String technology,String location,String company)
	{
		super(3,"kavya","female",45678900l,566778);
		this.role=role;
		this.technology=technology;
		this.location=location;
		this.company=company;
	}

	String printData()
	{
		System.out.println(super.printData());
		return role+" "+company+" "+technology+" "+location;
	}
	
	String getErrors()
	{
		return "no of erors in a project: "+10;
	}

}

class Software
{
	public static void main(String [] args)
	{
		Programmer programmer=new Programmer("developer","java","hyd",123);
		System.out.println(programmer.printData());
		System.out.println(programmer.getSalary());
		System.out.println(programmer.getBonus());

		HR hr=new HR("Recuritment specialist","sales predicion","hyd",1500);
		System.out.println(hr.printData());
		System.out.println(hr.getSalary());
		System.out.println(hr.getStatus());

		Tester tester=new Tester("manual tester","automachine","vij","ibm");
		System.out.println(tester.printData());
		System.out.println(tester.getSalary());
		System.out.println(tester.getErrors());

	}
}



/*

1 kalyani female 34567565
developer java hyd 123
45678.0
500.0
2 suvarna male 23456788
Recuritment specialist sales predicion hyd
67977.0
no of recuritments: 1500
3 kavya female 45678900
manual tester ibm automachine vij
566778.0
no of erors in a project: 10
*/


		
	
		
		

	