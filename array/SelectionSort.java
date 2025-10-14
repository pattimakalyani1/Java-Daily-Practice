class SelectionSort
{
	public static void main(String [] args)
	{
		int [] a=new int[]{10,2,3,43,56,75,98,0};
		for(int temp:a)
			System.out.print(temp+"\t");
		System.out.println();
		int x,temp;
		for(x=0;x<=a.length-1;x++)
		{
		int min=x,y;//min=0
		for(y=x+1;y<=a.length-1;y++)//x=1;
		{
			if(a[min]>a[y])
				min=y;
		}
		temp=a[min];
		a[min]=a[x];
		a[x]=temp;		
		}
		System.out.println("sorted:");
		for(int temp1:a)
			System.out.print(temp1+"\t");
		
	
	}
}


/*

10      2       3       43      56      75      98      0
sorted:
0       2       3       10      43      56      75      98

*/


class SelectionSort1
{
	public static void main(String [] args)
	{
		int [] a=new int[]{10,2,3,43,56,75,98,0};
		for(int temp:a)
			System.out.print(temp+"\t");
		System.out.println();
		SelectionSort1 s=new SelectionSort1();
		int c[]=s.calSort(a);
		for(int temp:c)
			System.out.print(temp+"\t");
		System.out.println();


	
	}
	int [] calSort(int [] a)
	{
		int x,temp;
		for(x=0;x<=a.length-1;x++)
		{
			int min=x,y;//min=0
			for(y=x+1;y<=a.length-1;y++)//x=1;
			{
				if(a[min]>a[y])
					min=y;
			}
			temp=a[min];
			a[min]=a[x];
			a[x]=temp;		
		}
		return a;
	}
}
	




























