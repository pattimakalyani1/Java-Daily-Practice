class TP32
{
	public static void main(String[] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			int temp=rows;
			for(int c=r;c<=rows;c++)
			{
				System.out.print(temp*3+" ");
				temp--;
			}
			System.out.println();
		}
	}
}	

/*

15 12 9 6 3
15 12 9 6
15 12 9
15 12
15

*/