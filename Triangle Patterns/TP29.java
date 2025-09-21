class TP29
{
	public static void main(String [] args)
	{
	int rows=4;
		for(int r=1;r<=rows;r++)
		{
			int temp=8,b=7;
			for(int c=r;c<=rows;c++)
			{
				
				System.out.print(temp+" ");
				temp=temp+b;
				b=b-1;
			}
			System.out.println();
		}
	}
}
				
/*

8 15 21 26
8 15 21
8 15
8

*/