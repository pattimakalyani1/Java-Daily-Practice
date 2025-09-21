class TP34
{
	public static void main(String[] args)
	{
	int rows=4;
		for(int r=1;r<=rows;r++)
		{
			int temp=13,b=3;
			for(int c=r;c<=rows;c++)
			{
				System.out.print(temp+" ");
				temp-=b;
				b--;
			}
			System.out.println();
		}
	}
}


/*

13 10 8 7
13 10 8
13 10
13

*/