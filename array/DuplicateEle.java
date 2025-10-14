class DuplicateEle
{
	public static void main(String [] args)
	{
		int [] a=new int[]{10,9,20,10,8,39,39,8};
		boolean [] b=new boolean[a.length];
		for(int temp:a)
			System.out.print(temp+"\t");
		System.out.println();
		System.out.println("Duplicate elements in a array:");

		int x,y,count=0;
		for(x=0;x<=a.length-1;x++)
		{
			if(b[x]==true)
				continue;
			count=1;
			for(y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=true;
				}
			}
			if(count>1)
			{
				System.out.println(a[x]);
			}
		}
	}
}


/*

10      9       20      10      8       39      39      8
Duplicate elements in a array:
10
8
39

*/

class DuplicateEle1
{
	public static void main(String [] args)
	{
		int [] a=new int[]{10,9,20,10,8,39,39,8};
		boolean [] b=new boolean[a.length];
		for(int temp:a)
			System.out.print(temp+"\t");
		System.out.println();
		System.out.println("Duplicate elements in a array:");
		DuplicateEle1 d=new DuplicateEle1();
		d.calDup(a,b);
	}
	void calDup(int a[],boolean b [])
	{
		int x,y,count=0;
		for(x=0;x<=a.length-1;x++)
		{
			if(b[x]==true)
				continue;
			count=1;
			for(y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=true;
				}
			}
			if(count>1)
			{
				System.out.println(a[x]);
			}
		}
	
	}
}

/*

10      9       20      10      8       39      39      8
Duplicate elements in a array:
10
8
39

*/
