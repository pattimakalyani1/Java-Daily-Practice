class Student
{
	public static void main(String [] args)
	{
	int roll=1;
	String name="kavya";
	String section="A";
	String email="kavya@gmail.com";
	int m1=96,m2=98,m3=79;
	double total=m1+m2+m3;
	double max_marks=60;
	double percent=total/max_marks*100;
	double scholarship;
	double fee=10000;
	double total_fee;
	int donation;
	double cgst,sgst,gst,final_fee;
	if(roll<100)
	{
		System.out.println("old admission");
	}
	else
	{
		System.out.println("new adimission");
	if(m1>=35 && m2>=35 && m3>=35)
	{
		System.out.println("paased all subjects");
	}
	else
	{
		System.out.println("failed");
	if(percent>80)
	{
		scholarship=10/100.0*fee;
		donation=0;
	        section="cream";
	}
	else
	{
		scholarship=0;
		donation=5000;
	}
	total_fee=fee+scholarship+donation;
	cgst=5.0/100*total_fee;
	sgst=5.0/100*total_fee;
	gst=cgst+sgst;
	final_fee=total_fee+gst;

			
	System.out.println("Roll number: "+roll);
	System.out.println("Name: "+name);
	System.out.println("Email"+email);
	System.out.println("M1 "+m1);
	System.out.println("M2: "+m2);
	System.out.println("M3: "+m3);
	System.out.println("Total:"+ total);
	System.out.println("Percentage: "+percent);
	System.out.println("final fee:"+final_fee);
	}
}
}
	

	