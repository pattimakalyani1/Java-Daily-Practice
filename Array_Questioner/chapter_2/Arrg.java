class Arrg
{
	public static void main(String [] args)
	{
		int a[]=new int[]{17,20,13,40,10};
		int [] b=new int[a.length];
		System.out.println("a array:");
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		// arranging the even indices first and odd indices next
		int mid=(a.length-1)/2;
				int y=0;
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
		System.out.println("first even indices elements and next odd indices elements:");
		for(int temp:b)
			System.out.print(temp+" ");
		System.out.println();
		// even indices are sorting in descending order using selection sort

		int mid1=(b.length-1)/2;
		for(int x=0;x<mid1;x++)
		{
			int min=x,temp;
			for( y=x+1;y<=mid1;y++)
			{
				if(b[min]>b[y])
				{
					min=y;
				}
				
			}
			temp=b[min];
				b[min]=b[x];
				b[x]=temp;

		
	
		}
		// odd indices are sorting in descending order using selection sort
		for(int x=mid1+1;x<a.length-1;x++)
		{
			int min=x,temp;
			for( y=x+1;y<=a.length-1;y++)
			{
				if(b[min]<b[y])
				{
					min=y;
				}
				
				
			}
			temp=b[min];
			b[min]=b[x];
			b[x]=temp;
			
		}
	
		System.out.println("even indices are in ascending order and odd indices are in descending order:");
		for(int temp:b)
			System.out.println(temp);
	}
}