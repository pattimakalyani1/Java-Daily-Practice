class TP5
{
	public static void main(String [] args)
	{
	int rows=5;
	for(int r=1;r<=rows;r++)
	{
		int temp=r;
		for(int c=1;c<=r;c++)
		{
			System.out.print(temp+" ");
			temp--;
		}
		System.out.println();
	}
	}
}
			


/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
*/