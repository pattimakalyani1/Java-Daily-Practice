class Str13
{
	public static void main(String [] args)
	{
		String s="xabcdy";
		String s2="";	
		char c2='a',c1='d';
		for(int x=0;x<s.length();x++)
		{
			for(int y=x+1;y<=s.length();y++)
			{
				 s2=s.substring(x,y);
				char c[]=s2.toCharArray();
				if(c[0]==c2 && c[c.length-1]==c1)
				{
					
					for(int z=1;z<c.length-1;z++)
						System.out.print(c[z]);
				}
			}
		}
	}
}

//bc