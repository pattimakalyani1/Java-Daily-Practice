class TP9
{
	public static void main(String [] args)
	{
	int rows=4,temp=1;
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=r;c++)
		{
			System.out.print(temp*2+" ");
			temp++;
		}
		System.out.println();
	}
	}
}



/*
2
4 6
8 10 12
14 16 18 20
*/