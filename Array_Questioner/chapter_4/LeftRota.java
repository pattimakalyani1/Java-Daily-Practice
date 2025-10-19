class LeftRota
{
	public static void main(String [] args)
	{
		int [] a=new int []{10,20,30,40};
		for(int temp:a)
			System.out.print(temp+" ");

		int r=5;
		for(int y=1;y<=r;y++)
		{
			int copy=a[0];
			for(int x=0;x<a.length-1;x++)
			{
				a[x]=a[x+1];
				
			}
			a[a.length-1]=copy;
		}
		System.out.println();
		for(int temp:a)
			System.out.print(temp+" ");
	}
}


/*

10 20 30 40
20 30 40 10

*/