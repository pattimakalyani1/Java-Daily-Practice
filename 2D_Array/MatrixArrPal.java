class MatrixArrPal
{
	public static void main(String [] args)
	{
		int [][] a=new int[][]{{154,131,371},{4,121,6}};
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{ 
				int temp=a[r][c],rev=0;
				while(a[r][c]!=0)
				{
					rev=rev*10+(a[r][c]%10);
					//System.out.println(rev);
					a[r][c]/=10;
				}
				if(rev==temp)
					System.out.println(rev);
			}
		}
	}
}


/*

131
4
121
6

*/