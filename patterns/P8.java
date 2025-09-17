class P8
{
	public static void main(String [] args)
	{
		int rows=5,cols=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r%2==0 && c%2==0)
				{
					System.out.print("$ ");
				}
				else
					System.out.print("# ");
			}
			System.out.println();

		}
	}
}
