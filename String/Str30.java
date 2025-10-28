class Str30
{
	public static void main(String [] args)
	{
		String s="A1B2C3&7";
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			//s1=s1+ch;
			if(Character.isDigit(ch))
			{
				int num=ch-'0';
				for(int y=1;y<=num;y++)
				s1=s1+(s.charAt(x-1));
			}
		}System.out.println(s1);
	}
}


//ABBCCC&&&&&&&		


class Str31
{
	public static void main(String [] args)
	{
		String s="aaabbbbccc";
		char c[]=s.toCharArray();
		int count=0;
		String str="";
		boolean b[]=new boolean[c.length];
		for(int x=0;x<=c.length-1;x++)
		{
			if(b[x]==true)
				continue;
			count=1;
			for(int y=x+1;y<=c.length-1;y++)
			{
				if(c[x]==c[y])
				{
					count++;
					b[y]=true;
				}
			}
			str=str+c[x]+""+count;
		}
		System.out.println(str);
	}
}


//a3b4c3	
			