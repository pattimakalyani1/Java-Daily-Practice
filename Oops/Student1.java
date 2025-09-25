class Student
{
	public static void main(String [] args)
	{
		std s=new std();
		int total=s.calTotal(24,25,18);
		double Per=s.calPer(total);
		s.fee=10000;
		s.roll=1;
		s.name="kalayani";
		s.section="A";
		s.email="kalyani@gmail.com";
		double donatio=s.calDonation(Per,s.fee);
		double scholarship=s.calScholarship(Per,s.fee);
		String section=s.calSection(Per);
		double total_fee=s.calFinalFee(s.fee,donatio,scholarship);
		s.printData(s.roll,s.name,section,s.email,total_fee);
		
		
		
	}
}
class std
{
	int roll,m1,m2,m3,fee;
	String email;
	String section;
	double donation,scholar;
	String name;
	int calTotal(int m1,int m2,int m3)
	{
		return m1+m2+m3;
	}
	double calPer(int total)
	{
		return total/60.0*100;
	}
	double calDonation(double per,int fee)
	{
		if(per>80)
		{
			 donation=5.0/100*fee;
		}
		else
		{
			donation=23.5/100*fee;
		}
	return donation;
	}
	double calScholarship(double per,int fee)
	{
		if(per>80)
		{
			 scholar=23.5/100*fee;
		}
		else
		{
			scholar=5.0/100*fee;
		}
		return scholar;
	}
	String calSection(double per)
	{
		if(per>80)
		{
			return "Cream";
		}
		else
		{
			return "First";
		}
	}
	double calFinalFee(int fee,double donatio,double scholarship)
	{
		return fee+donatio-scholarship;
	}
	
	void printData(int roll,String name,String section,String email,double total_fee)
	{
		System.out.println(roll+" "+name+" "+section+" "+email+" "+total_fee);
	}
}
		

	