class Switch4
{
	public static void main(String [] args)
	{
		int month=2;
		int year=2000;
			switch(month)
			{
				case 1,3,5,7,8,10,12:
					System.out.println("31 days");
					break;
				case 2:
					if((year%4==0 && year%100!=0)||year%400==0)
					{
						System.out.println("29 days");
					}
					else
						System.out.println("28 days");
					break;
				case 4,6,9,11:
					System.out.println("30 days");
					break;
				default:
					System.out.println("months shoild be from 1 to 12");
			}
	}
}