class MatrixArrEve
{
	public static void main(String [] args)
	{
		int [][] a=new int[][]{{153,131,371},{370,121,6}};
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{  	
				if(a[r][c]%2==0)
				{
					System.out.println(a[r][c]);
				}
			}
		}
	}
}

/*

370
6

*/



class MatrixArrEvenIndex
{
	public static void main(String [] args)
	{
		int [][] a=new int[][]{{153,131,371},{370,121,6}};
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{  	
				if(r%2==0 && c%2==0)
				{
					System.out.println(a[r][c]);
				}
			}
		}
	}
}

/*

153
371

*/



class MatrixArrEvenIndex1
{
	public static void main(String [] args)
	{
		int [][] a=new int[][]{{153,131,371},{370,121,6}};
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{  	
				if(r%2==0 || c%2==0)
				{
					System.out.println(a[r][c]);
				}
			}
		}
	}
}


/*

153
131
371
370
6

*/
