class TP31
{
	public static void main(String[] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<=rows;c++)
			{
				System.out.print("  ");
			}
			int temp=1;
			for(int c=1;c<=r;c++)
			{
				System.out.print(temp+" ");
				temp+=2;
			}
			System.out.println();
		}
	}
}	


/*

          1
        1 3
      1 3 5
    1 3 5 7
  1 3 5 7 9

*/