class StrDup
{
	public static void main(String [] args)
	{
		String s="hello all good";
		String s2="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(s.indexOf(ch)!=s.lastIndexOf(ch))
			{
				if(s2.indexOf(ch)==-1)
					s2=s2+ch;
			}
			
		}
		System.out.println(s2);
	}
}


/*


lo


*/




class StrDup1
{
	public static void main(String [] args)
	{
		String s="helloo all goodd";
		
		String s1[]=s.split(" ");
		for(int y=0;y<=s1.length-1;y++)
		{
			String word=s1[y];
			String s2="";
			for(int x=0;x<word.length();x++)
			{
				char ch=word.charAt(x);
				if(word.indexOf(ch)!=word.lastIndexOf(ch))
				{
					if(s2.indexOf(ch)==-1)
						s2=s2+ch;
				}
			
			}System.out.println(s2);
			
		}
		
	}
}

/*

lo
l
od

*/





















