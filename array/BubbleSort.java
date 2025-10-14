class BubbleSort
{
	public static void main(String[] args)
	{
		int[] a=new int[]{1,23,43,2,3,45,67,90,8};
		System.out.println("before sorting");
		for(int temp1:a)
			System.out.print(temp1+" ");
		System.out.println();
		for(int x=0;x<a.length-1;x++)
		{
			for(int y=0;y<a.length-1-x;y++)
			{
				if(a[y]>a[y+1])
				{
					int temp=a[y];
					a[y]=a[y+1];
					a[y+1]=temp;
				}
			}
		}
		System.out.println("after sorting");
		for(int temp1:a)
			System.out.print(temp1+" ");
	}
}


/*

before sorting
1 23 43 2 3 45 67 90 8
after sorting
1 2 3 8 23 43 45 67 90

*/