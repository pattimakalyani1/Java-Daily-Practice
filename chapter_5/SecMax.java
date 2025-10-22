class SecMax
{
	public static void main(String [] args)
	{
		int a[]={100,89,67,45,36,45,36,76};
		int max=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
		int count=0;
		for(int x=0;x<a.length-1;x++)
		{
			int min=x;
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[min]>a[y])
				{
					min=y;
				}
			}
			int temp=a[min];
			a[min]=a[x];
			a[x]=temp;
		}
		for(int temp1:a)
			System.out.print(temp1+" ");
		System.out.println();
		for(int x=a.length-1;x>0;x--)
		{
			if(a[x]!=a[x-1])
				{
					count++;
					if(count==2)
					{
						System.out.println(a[x]);
						break;
					}
				}
			
		}

}



/*

36 36 45 45 67 76 89 100
second max elemenst is 89

*/



class SecMin
{
	public static void main(String [] args)
	{
		int a[]={100,89,67,45,36,36,45,76};
		int min=Integer.MAX_VALUE;
		int secmin=Integer.MAX_VALUE;
		int count=0;
		for(int x=0;x<a.length-1;x++)
		{
			int min1=x;
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[min1]>a[y])
				{
					min1=y;
				}
			}
			int temp=a[min1];
			a[min1]=a[x];
			a[x]=temp;
		}
		for(int temp1:a)
			System.out.print(temp1+" ");
		System.out.println();
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				count++;
				if(count==2)
				{
					System.out.println(a[i+1]);
					break;
				}
			}
		}
				
					
	}
}
}

/*

36 36 45 45 67 76 89 100
45

*/
		
		
	

					
		
