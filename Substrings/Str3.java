class Str3
{
	public static void main(String [] args)
	{
		String s="hello";
		int n=s.length();
		int m=(n*(n+1)/2);
		String s2="ell";
		Boolean b=false;
		String s1[]=new String[m];
		int z=0;
		for(int x=0;x<s.length();x++)
		{
			for(int y=x+1;y<=s.length();y++)
			{
				
				s1[z]=s.substring(x,y);
				if(s1[z].equals(s2))
				{
					b=true;
				}
				z++;
			}
		}
	
		System.out.println(b?"true":"false");
	}
}


//true