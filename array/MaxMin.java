class MaxMin
{
	public static void main(String [] args)
	{
		int [] a=new int[]{10,2,3,43,56,75,98,0};
		for(int temp:a)
			System.out.print(temp+"\t");
		System.out.println();
		int y;
		for(y=0;y<a.length;y++)
		{
		int min=y,x;//min=0
		for(x=y+1;x<=a.length-1;x++)//x=1;
		{
			if(a[min]>a[x])
				min=x;
		}
		//System.out.println(min);
		a[y]=a[y]+a[min];
		a[min]=a[y]-a[min];
		a[y]=a[y]-a[min];
		for(int temp:a)
			System.out.print(temp+"\t");
		System.out.println();
		}
	
	}
}
			
			
