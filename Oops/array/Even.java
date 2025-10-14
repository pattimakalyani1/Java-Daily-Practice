class Even
{
	public static void main(String[] args)
	{
		int c[]=new int[]{23,45,64,65,78,9876,5,6,89};
		Even e=new Even();
		int count1=0;
		int [] d=e.printEven(c);
		for(int temp:d)
		{
			System.out.print(temp+" ");
			count1++;
		}
		System.out.println();
		System.out.println("no of Even numbers in a array:"+count1);
	}
	int [] printEven(int [] c)
	{
		int b[]=new int[c.length];
		int count=0;
		for(int x=0;x<=c.length-1;x++)
		{
			if(c[x]%2==0)
			{
				
				b[count]=c[x];
				count++;
			}
		}
		int[] v=new int[count];
		for(int x=0;x<count;x++)
		{
			v[x]=b[x];
		}
		return v;
	}
		
	
}
