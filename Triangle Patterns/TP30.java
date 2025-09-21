class TP30
{
	public static void main(String[] args)
	{
	int rows=4;
		for(int r=1;r<=rows;r++)	
		{	int temp=3;
			for(int c=r;c<=rows;c++)
			{
				System.out.print(temp+" ");
				temp=temp+9;
			}
			System.out.println();
		}
	}
}


/*
3 12 21 30
3 12 21
3 12
3

*/				