class matrix
{
	public static void main(String [] args)
	{
		int [][]a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int j=0;
		for(int i=2;i>=0;i--)
		{

			for(int x=0;x<=2;x++)
			{
				System.out.print(a[i][j]+" ");
					i--;
			}

				System.out.println();
				j++;
				i=2;                        
	
			
		}
	}
}
		