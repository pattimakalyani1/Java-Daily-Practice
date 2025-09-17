class EvenNu
{
	public static void main(String [] args)
	{
		int x,count=0;
		for(x=4438;x<=903498;x++)
		{
			if(x%2==0)
			{
				count++;
				System.out.println(x);
			}
		}System.out.println("count: "+count);
	}
}



class EvenNu1
{
	public static void main(String [] args)
	{
		int x,count=0;
		for(x=4438;x<=903498;x+=2)
		{	
				count++;
				System.out.println(x);
			
		}System.out.println("count: "+count);
	}
}



class Nu1
{
	public static void main(String [] args)
	{
	for(int x=10;x>0;x++)
	{
		System.out.println("kavy");
		
	}
	}
}

class Nu2
{
	public static void main(String [] args)
	{
	int count=0;
	for(int i=1;i<100;i++)
	{
		if(i%2!=0)
		{
			count++;
			System.out.println(i);
		}
	}System.out.println(count);
	}
}