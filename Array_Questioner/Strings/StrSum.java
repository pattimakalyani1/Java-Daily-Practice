class StrSum
{
	public static void main(String [] args)
	{
		String s=new String("h1e3l4lo");
		char c[]=s.toCharArray();
		int sum=0;
		for(int x=0;x<=c.length-1;x++)
		{	
			if((c[x]>='a' && c[x]<='z' )||(c[x]>='A' && c[x]<='Z'));
			else
			{
			
				sum+=c[x]-'0';
				//System.out.println(sum);
			}
		}
		System.out.println(sum);
			
	}
}


/*

8

*/