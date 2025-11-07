class Str7
{
	public static void main(String [] args)
	{
		String s="abcabcbb";
		String s1="";
		int max=0;
		String max_word="";
		for(int x=0;x<s.length();x++)
		{
			for(int y=x+1;y<=s.length();y++)
			{
				s1=s.substring(x,y);
				String s2="";
				for(int i=0;i<s.length();i++)
				{
					char c=s.charAt(i);
					if(s1.indexOf(c)!=s1.lastIndexOf(c))
					{
						if(s2.indexOf(c)==-1)
						{
							s2=s2+c;
							break;
						}
					}
				}
		
				if(s2.length()==0)
				{
					if(max<s1.length())
					{
						max=s1.length();
						max_word=s1;
					
					}
				}
					
			}
		}
		System.out.println(max_word);
	}
								
}
	
//abc 	
