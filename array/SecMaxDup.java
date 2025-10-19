class SecMaxDup
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,10,30,40,40,30,50,50};
		boolean [] b=new boolean[a.length];
		int [] c=new int[a.length];
		int count=0;
		for(int x=0;x<a.length-1;x++)
		{
			if(b[x]==true)
				continue;
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==a[y])
				{
					b[y]=true;
					count++;
				}
			}
		
		if(count>0)
		{
			c[x]=a[x];
		}
		}
		int max=Integer.MIN_VALUE;
		int smax=max;
		for(int x=0;x<=c.length-1;x++)
		{
			if(c[x]>max)
			{
				smax=max;
				max=c[x];
			}
			else if(max>c[x] && smax<c[x])
			{
				smax=c[x];
			}
		}	
		System.out.println(smax);
	}
}

/*

40

*/
			
				
		