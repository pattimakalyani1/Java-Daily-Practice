class EvOdIn
{
	public static void main(String [] args)
	{
		int [] a= new int []{0,1,26,38,45,5,6};
		int [] b=new int [a.length];
		/*int y=0;
		for(int x=0;x<=a.length-1;x++)
		{
			if(x%2==0
			{
				b[y]=a[x];
				System.out.println(b[y]);
			}
			y++;
		}
		int z=0;
		for(int x=0;x<=a.length-1;x++)
		{
			if(x%2!=0)
			{
				b[z]=a[x];
				System.out.println(b[z]);
			}
		/*int y=0,mid=(a.length-1)/2;
		for(int x=0;x<=a.length-1;x++)
		{
			if(x%2==0)
			{
				b[y]=a[x];
					y++;
			}
			else
			{
				b[mid+1]=a[x];
					mid++;
			}
			
		}
		for(int x=0;x<=b.length-1;x++)
		System.out.println(b[x]);*/

		int y,x;
		for(x=0,y=0;x<=a.length-1;x+=2,y++)
		{
				b[y]=a[x];
				System.out.println(b[y]);
		}
		for(x=1;x<=a.length-1;x+=2,y++)
		{
			b[y]=a[x];
			System.out.println(b[y]);
		}
		

	}
}


/*

0
26
45
6
1
38
5

*/

		