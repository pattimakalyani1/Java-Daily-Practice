class Ev
{
	public static void main(String [] args)
	{
		int i,count=0;
		for(i=3;true;i++)
		{
			if(i%2==0)
			{
				count++;
			}
			if(count==4)
			{
				System.out.println(i);
				break;
			}
		}
	
	}
}
				