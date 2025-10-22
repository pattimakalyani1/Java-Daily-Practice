class Diag
{
	public static void main(String [] args)
	{
	int a[][]=new int[][]{{1,2,3},{3,4,5},{1,2,3}};
	int sum=0,sum1=0;
	for(int x=0;x<=a.length-1;x++)
	{
		for(int y=0;y<=a[0].length-1;y++)
		{
			System.out.print(a[x][y]+" ");
		}
		System.out.println();
	}
	
	for(int x=0;x<=a.length-1;x++)
	{
		if(x==x)
			sum=sum+a[x][x];
	}
	System.out.println("sum of first diagonal:"+sum);
	
	for(int x=0,y=a.length-1;x<=a.length-1;x++,y--)
	{
		sum1=sum1+a[x][y];

	}
	System.out.println("sum of second diagonal:"+sum1);
	}
}
	

/*

1 2 3
3 4 5
1 2 3
sum of first diagonal:8
sum of second diagonal:8

*/