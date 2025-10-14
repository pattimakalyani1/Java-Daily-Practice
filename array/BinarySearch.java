class BinarySearch
{
	public static void main(String [] args)
	{
		int[] a=new int[]{10,12,15,17,19,21,33,35,77};
		int low=0,search=77;
		int high=a.length-1;
		int mid;
		boolean b=false;
		//System.out.print(a[mid]);
		while(low<=high)
		{
			mid=(low+high)/2;
			if(search>a[mid])
				low=mid+1;
			else if(search<a[mid])
				high=mid-1;
			else 
			{
				b=true;
				System.out.println("element is found:"+mid+" index");
				break;
			}
		}
		if(!b)
			System.out.println("element is not found:");
	}
}
	

/*

element is found:8 index

*/


//binary search on unsorted array:

class BinarySearch1
{
	public static void main(String [] args)
	{
		int[] a=new int[]{10,12,5,17,9,21,303,35,27};
		System.out.println("before sorting:");
		for(int temp1:a)
				System.out.print(temp1+" ");
		System.out.println();
		for(int x=0;x<=a.length-1;x++)
		{
			int min=x,temp;
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[min]>a[y])
					min=y;
			}

			temp=a[min];
			a[min]=a[x];
			a[x]=temp;
		}
		System.out.println("after sorting:");
		for(int temp2:a)
				System.out.print(temp2+" ");
		System.out.println();
		int low=0,high=a.length,mid,search=17;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(search>a[mid])
				low=mid+1;
			else if(search<a[mid])
				high=mid-1;
			else
				System.out.println(search+" element is found:"+mid+" index  or "+(mid+1)+" position");
				break;
		}
	}
}
					
/*

before sorting:
10 12 5 17 9 21 303 35 27
after sorting:
5 9 10 12 17 21 27 35 303
17 element is found:4 index  or 5 position

*/


//using methods:

class BinarySearch2
{
	public static void main(String [] args)
	{
		int[] a=new int[]{10,2,05,71,1,201,33,35,77};
		BinarySearch2 b=new BinarySearch2();
		b.isSearch(a);
				
	}
	int [] calSort(int [] a)
	{
		for(int x=0;x<=a.length-1;x++)
		{
			int min=x,temp;
			for(int y=x+1;y<=a.length-1;y++)
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
	void isSearch(int [] a)
	{
		int [] d=calSort(a);
		int low=0,search=77;
		int high=d.length-1;
		int mid=0;
		boolean b=false;
		//System.out.print(a[mid]);
		while(low<=high)
		{
			mid=(low+high)/2;
			if(search>d[mid])
				low=mid+1;
			else if(search<d[mid])
				high=mid-1;
			else 
			{
				b=true;
				break;
			}
		}
		if(b)
			System.out.println("element is found "+ mid+" index");
		else
			System.out.println("element is  not found");
	
	}
}



































			