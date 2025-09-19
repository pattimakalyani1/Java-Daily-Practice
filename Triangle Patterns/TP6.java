class TP6
{
	public static void main(String [] args)
	{
	int rows=4,temp=1;
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=r;c++)
		{
			System.out.print(temp+" ");
			temp++;
		}
		System.out.println();
	}
	}
}


/*
1
2 3
4 5 6
7 8 9 10
*/		