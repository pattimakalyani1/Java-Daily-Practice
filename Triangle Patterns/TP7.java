class TP7
{
	public static void main(String [] args)
	{
	int rows=5;
	for(int r=1;r<=rows;r++)
	{
		int temp=1;
		for(int c=rows;c>=r;c--)
		{
			System.out.print(temp+" ");
			temp++;
		}
		System.out.println();
	}
	}
}


/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/