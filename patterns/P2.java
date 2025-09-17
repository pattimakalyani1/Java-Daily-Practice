class P2
{
	public static void main(String [] args)
	{
		int rows=4,cols=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r==2 && c==1||r==3 && c==3||r==4 && c==4)
				{
					System.out.print("$");
				}
				else
					System.out.print("#");
				
			}
		System.out.println();
		}
	}
}
	