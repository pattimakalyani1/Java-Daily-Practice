class Job
{
	public static void main(String [] args)
	{
	String degree="MTech";
	String branch="cse";
	String s;
	/*if(degree=="btech")
	{
		if(branch=="cse")
		{
			System.out.println("choose IT job");
		}
		else
		{
			System.out.println("choose NON IT job");
		}
	}
	else
	{
		if(degree=="MTech")
		{
			System.out.println("choose Assistant Proffesor");
		}
		else
		{
			System.out.println("choose other options");
		}
	}*/
        s=(degree=="btech")?((branch=="cse")?("choose IT job"):("choose NON IT job")):((degree=="MTech")?("choose assistant profeesor"):("choose other options"));
	System.out.println(s);
	}
}

