class TP17
{
	public static void main(String [] args)
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			int temp=rows-r+1;
			for(int c=1;c<=r;c++)
			{
				System.out.print(temp);
				temp++;
			}
			System.out.println();
		}
	}
}



/*
5
45
345
2345
12345
*/
