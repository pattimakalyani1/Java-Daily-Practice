class PA
{
	public static void main(String [] args)
	{
		int rows=5,cols=9;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r+c==rows+1||r==3&&c==4||r==2&&c==6||r==3&&c==5||r==3&&c==6||r==3&&c==7||r==5&&c==9||r==4&&c==8||r==4&&c==2)
				System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}



class PB
{
	public static void main(String [] args)
	{
		int rows=5,cols=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r==1||c==1||c==3||c==cols||r==rows)
				{
					if(r==1&&c==cols||r==3&&c==cols||r==rows&&c==cols)
					{
						System.out.print("");
					}
					else
						System.out.print("*");
				}
				else
					System.out.print("");
			}
			System.out.println();
			System.out.println();
		}
	}
}
					