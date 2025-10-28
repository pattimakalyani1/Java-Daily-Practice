class StrMaxDup
{
	public static void main(String [] args)
	{
		String s="hello all good morningo ";		
		String s1[]=s.split(" ");
		int max=0;
		String max_word="";
		
		int count=0;
		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			boolean b[]=new boolean[word.length()];
			count=0;
			for(int y=0;y<word.length()-1;y++)
			{
				char c=word.charAt(y);
				if(b[y]==true)
					continue;
				for(int z=y+1;z<word.length();z++)
				{
					char ch=word.charAt(z);
					if(c==ch)
					{
						b[z]=true;
						count++;
					}
				}
			}
			if(max<count)
			{
				max=count;
				max_word=word;
			}
		}System.out.println(max_word);
	}
}
						
//morningo