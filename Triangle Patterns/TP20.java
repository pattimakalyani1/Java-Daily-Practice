class TP20
{
	public static void main(String [] args)
	{
		int rows=5;
		char letter='A';
		for(int r=1;r<=rows;r++)
		{
			
			for(int c=1;c<=r;c++)
			{
				System.out.print(letter+" ");
				letter++;
			}
			System.out.println();
		}
	}
}


/*
A
B C
D E F
G H I J
K L M N O
*/