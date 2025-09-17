class Studfee
{
	public static void main(String[] args)
	{
		int roll=1;
		String name="kavya";
		String email="kavya@gamil.com";
		int m1=19,m2=20,m3=16;
		int fee=35000;
		double total_marks=(m1+m2+m3);
		double max_marks=60;
		double donation=0,scholarship=0;
		double percent=total_marks/max_marks*100;
		String section=" ";
		if(percent>80)
			{
				donation=5.0/100*fee;
				scholarship=23.5/100*fee;
				section="cream";
			}
		else
			{
				
				donation=9.0/100*fee;
				scholarship=5.0/100*fee;
				section="first";
			}
		double total_fee=fee+donation-scholarship;
		double cgst=9.0/100*total_fee;
		double sgst=9.0/100*total_fee;
		double gst=cgst+sgst;
		double final_fee=total_fee+gst;
		System.out.println("roll number:"+roll);
		System.out.println("name:"+name);
		System.out.println("section:"+section);
		System.out.println("total marks:"+total_marks);
		System.out.println("percentage:"+percent);
		System.out.println("fee:"+fee);
		System.out.println("donation:"+donation);
		System.out.println("scholarship:"+scholarship);
		System.out.println("Total fee:"+total_fee);
		System.out.println("cgst(9%):"+cgst);
		System.out.println("sgst(9%):"+sgst);
		System.out.println("gst(18%):"+gst);
		System.out.println("final fee that should pay:"+final_fee);

	}
}


