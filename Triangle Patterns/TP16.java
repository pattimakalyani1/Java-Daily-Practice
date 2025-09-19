class TP16
{
	public static void main(String [] args)
	{
		int rows=4;
		for(int r=1;r<=rows;r++)
		{
			int temp=r;
			for(int c=1;c<=r;c++)
			{
				System.out.print(temp*temp+"  ");
				temp--;
			}
			System.out.println();
		}
		int row1=3;
		for(int r=1;r<=row1;r++)
		{
			int temp1=row1;
			for(int c=r;c<=row1;c++)
			{
				
				System.out.print(temp1*temp1+"  ");
				temp1--;
			}
			System.out.println();
							
		}
			
	}
}