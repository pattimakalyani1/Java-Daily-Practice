class Str
{
	public static void main(String [] args)
	{
		String s="kalyani";
		boolean b[]=new boolean[s.length()];
		char []c=s.toCharArray();
		int a[]=new int[b.length-1];
		int coun1=0;
		for(int x=0;x<c.length-1;x++)
		{
			if(b[x]==true)
				continue;
			int count=1;
			for(int y=x+1;y<=c.length-1;y++)
			{
				if(c[x]==c[y])
				{
					b[y]=true;
					count++;
					a[x]=count;
				}
				if(coun1<count)
					coun1=count;
			}
		}
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]==coun1)
				System.out.println(c[x]);
		}
		for(int temp:a)
			System.out.println(temp);
		
	}
}
			