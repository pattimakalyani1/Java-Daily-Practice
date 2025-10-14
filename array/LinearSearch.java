class LinearSearch
{
	public static void main(String [] args)
	{
		int [] a= new int[]{10,20,30,40,50,30,19};
		int search=30,count=0;
		Boolean b=false;
		for(int temp:a)
		{
			if(search==temp)
			{
				b=true;
				count++;
			}
		}
		System.out.println(b?"element is found":"element is not found");
		System.out.println(count);
	}
}

//using methods

class LinearSearch1
{
	public static void main(String [] args)
	{
		int [] a= new int[]{10,20,30,40,50,30,19};
		int search=30,count=0,c=0;
		Boolean b=false;
		int x;
		for(x=0;x<=a.length-1;x++)
		{
			if(a[x]==search)
			{
				b=true;
				count++;
				//System.out.println( "search element is present in :"+x+" position");
				if(count==1)
					System.out.println("first occurences:"+x+"position");
			}
			
			
		}
		if(count==count)
			System.out.println("last occurences:"+x);
		System.out.println(b?"element is found":"element is not found");
	}
}


/*

first occurences:2position
last occurences:7
element is found

*/