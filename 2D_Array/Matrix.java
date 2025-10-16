class Matrix
{
	public static void main(String[] args)
	{
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int x=0;x<=a.length;x++)
		{
			for(int y=0;y<=a[0].length-1;y++)
			{
				if(y==x)
				{
					sum=sum+a[x][y];
				}
			}
		}
		System.out.println(sum);
	}
}




class Matrix1
{
	public static void main(String[] args)
	{
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int x=0;x<=a.length-1;x++)
		{	
			if(x==x)
			{
				sum=sum+a[x][x];
			}
		}System.out.println(sum);
	}
}

class Matrix2
{
	public static void main(String[] args)
	{
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int x=0;x<=a.length;x++)
		{
			for(int y=0;y<=a[0].length-1;y++)
			{
				if((y+x)==2)
				{
					sum=sum+a[x][y];
				}
			}
			
		}
		System.out.println(sum);
	}
}


class Matrix3
{
	public static void main(String[] args)
	{
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int sum=0,y,x;
		for(x=0,y=2;x<=a.length-1;x++,y--)
		{	
			sum=sum+a[x][y];

		}
			System.out.println(sum);
	}
}



