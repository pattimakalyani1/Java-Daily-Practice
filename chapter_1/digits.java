class digits
{
	public static void main(String [] args)
	{
		int n1=678;
		if(n1>0 && n1<9)
		{
			System.out.println( n1 +" is a single digit number");
		}
		else if(n1>11 && n1<99)
		{
			System.out.println(n1+" is doubl digit");
		}
		else
		{
			System.out.println(n1+" is more than three digit");
		}
	}
}