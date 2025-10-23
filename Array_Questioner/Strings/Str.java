class Str
{
	public static void main(String [] args)
	{
		String s=new String("hello all good morning evening");
		String a[]=s.split(" ");
		int count[]=new int[a.length];
		int count1=0;
		for(int x=0;x<=a.length-1;x++)
		{
			 count[x]=a[x].length();
			 if(count1<count[x])
			{
				count1=count[x];
			}
		}
		
		for(int x=0;x<=a.length-1;x++)
		{
			if(count[x]==count1)
				System.out.println(a[x]);
		}
	}
}			
	
/*

morning
evening

*/

























