class TP10
{
	public static void main(String [] args)
	{
	int rows=4;
	for(int r=1;r<=rows;r++)
	{
		int temp=1;
		for(int c=1;c<=r;c++)
		{
			System.out.print(temp*temp+" ");
			temp++;
		}
		System.out.println();
	}
	}
}



/*
1
1 4
1 4 9
1 4 9 16
*/