class P10
{
	public static void main(String [] args)
	{
		int rows=10,cols=7;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				if(i==1||i==rows||i==4&&j==1||i==4&&j==7||i==7&&j==1||i==7&&j==7)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
		
			}System.out.println();
			
		}
	}
}


class P11
{
	public static void main(String [] args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=7;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
		

class P12
{
	public static void main(String [] args)
	{
	for(char i='A';i<='D';i++)
	{
		for(char j='A';j<='D';j++)
		{
			System.out.print(i);
		}
		System.out.println();
	}	
	
	}
}

























