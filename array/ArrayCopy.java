class ArrayCopy
{
	public static void main(String [] args)
	{
		int [] a=new int[]{10,20,30,40,50,60,70,80};
		int [] b=new int[a.length];
		for(int x=0;x<=a.length-1;x++)
		{
			b[x]=a[x];
			System.out.println(b[x]);
		}
		System.out.println("reverse:");
	
		/*for(int x=0;x<=a.length-1;x++)
		{
			b[a.length-1-x]=a[x];
		}*/
		/*int y=0;
		for(int x=a.length-1;x>=0;x--)
		{
			b[y]=a[x];
			y++;
		}*/
		int y=a.length-1;	
		for(int x=0;x<=a.length-1;x++)
		{
			b[x]=a[y];
			System.out.println(b[x]);
			y--;
		}
	
		
		/*for(int x=a.length-1,y=0;x>=0;x--,y++)
		{
			b[y]=a[x];
			System.out.println(b[y]);
			
		}*/

		
		System.out.println("first half same and second half reverse:");
		int mid=(a.length-1)/2;
		for(int x=0;x<=mid;x++)
		{
			b[x]=a[x];
			System.out.println(b[x]);
		}
		System.out.println("second half reverse:");
		int W=mid+1;
		for(int x=a.length-1;x>mid;x--)
		{
			b[W]=a[x];
			System.out.println(b[W]);
			W++;
		}
		
		System.out.println("first half reverse and second half same:");
		int z=0;
		for(int x=mid;x>=0;x--)
		{
			b[z]=a[x];
			System.out.println(b[z]);
			z++;
		}
		System.out.println("Second half same:");

		for(int x=mid+1;x<=a.length-1;x++)
		{
			b[x]=a[x];
			System.out.println(b[x]);
		}


	}
}


/*

10
20
30
40
50
60
70
80
reverse:
80
70
60
50
40
30
20
10
first half same and second half reverse:
10
20
30
40
second half reverse:
80
70
60
50
first half reverse and second half same:
40
30
20
10
Second half same:
50
60
70
80

*/