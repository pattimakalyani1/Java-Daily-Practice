class Pattern
{
	public static void main(String [] args)
	{
		int rows=4;
		for(int r=1;r<=rows;r++)
		{
			int temp=1;
			for(int c=1;c<=2*r;c++)
			{
				if(c%2==0)
				{
					if(c%2==0 && r%2==0)
					{
						System.out.print("*");
					}
					else
					System.out.print(" ");
				}
				else
				{
				System.out.print(temp);
				temp++;
				}
			}
			System.out.println();
			
		}
	}
}


/*

1
1*2*
1 2 3
1*2*3*4*

*/

			 		