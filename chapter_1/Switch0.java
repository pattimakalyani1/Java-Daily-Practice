class kavya
{
	public static void main(String [] args)
	{
	double sal=0;
        String dept="it";
	switch (dept) {
    	case "it"      -> sal=4000;
    	case "hr"      -> sal=3000;
    	case "finance" -> sal=3500;
    	default        -> sal=1000;
	}
	System.out.println(sal);
	}
}