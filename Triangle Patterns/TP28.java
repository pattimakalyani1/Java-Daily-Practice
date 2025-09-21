class TP28
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			int temp=1;
			for(int c=r;c<=rows+1;c++)
			{
				if(temp==2)
				{
					temp++;
				}
				else
				{
				 System.out.print(temp*3+" ");
			
				 temp++;	
				}
			}
			System.out.println();
		}
	}
}


/*
3 9 12 15 18
3 9 12 15
3 9 12
3 9
3
*/


class TP281
{
	public static void main(String [] args)
	{
	int rows=5;
		for(int r=1;r<=rows;r++)
		{
			int temp=1;
			for(int c=r;c<=rows;c++)
			{
				if(temp==2)
				{
					temp++;
				}
				 System.out.print(temp*3+" ");
				 temp++;	
				
			}
			System.out.println();
		}
	}
}

/*

3 9 12 15 18
3 9 12 15
3 9 12
3 9
3

*/
