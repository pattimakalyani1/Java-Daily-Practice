class TP8
{
	public static void main(String [] args)
	{
	int rows=4,temp=1;
	for(int r=1;r<=rows;r++)
	{
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
4 9
16 25 36
49 64 81 100
*/