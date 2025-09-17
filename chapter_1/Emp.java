class Emp
{
	public static void main(String[] args)
	{
		int emp_id=1;
		String name="kavya";
		int basic_sal=30000;
		double ta=11.5/100*basic_sal;
		double da=3.5/100*basic_sal;
		double hra=15.5/100*basic_sal;
		double total_sal=basic_sal+ta+da+hra;
		double cgst=9.0/100*total_sal;
		double sgst=9.0/100*total_sal;
		double gst=cgst+sgst;
		double final_sal=total_sal+gst;
		System.out.println("employee id "+emp_id);
		System.out.println("employee name "+name);
		System.out.println("Final salary is "+final_sal);
	}
}


