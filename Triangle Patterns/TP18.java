class TP18
{
	public static void main(String [] args)
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			int temp=r;
			for(int c=1;c<=r;c++)
			{
				if(c==1||r==rows||c==r)
				{
					System.out.print(temp+" ");
					temp--;
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}


/*
1
2 1
3   2
4     3
5 4 3 2 1
*/