class TP33
{
	public static void main(String[] args)
	{
	int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("  ");
			}
			int temp=8,b=5;
			for(int c=r;c<=rows;c++)
			{	
				System.out.print(temp+" ");
				temp=temp+b;
				b--;
			}
			System.out.println();
		}
	}
}	


/*
 
  8 13 17 20
    8 13 17
      8 13
        8

*/