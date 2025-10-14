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