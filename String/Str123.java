class Str123
{
	public static void main(String [] args)
	{
		String s="am-a-n&ap*la$n";
		String s1="";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		s1=sb.toString();
		String res="";
		char c[]=s.toCharArray();
		char c1[]=s1.toCharArray();
		int y=0;
		for(int x=0;x<=c.length-1;x++)
		{
			char a=c[x];
			if(Character.isDigit(a)||Character.isLetter(a))
			{
				while(y<c1.length && !((Character.isDigit(a)) && (Character.isLetter(a))))
				{
					y++;
				}
				c[x]=c1[y];
				y++;
			}
		}
		for(int x=0;x<=c.length-1;x++)
		{
			res=res+c[x];
		}
		System.out.println(res);
				
			
	}
}


//na-l-p&an*am$a
				
				
		