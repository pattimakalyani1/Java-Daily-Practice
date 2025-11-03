class Str5
{
	public static void main(String [] args)
	{
		String s="babad";
		int n=s.length();
		int m=(n*(n+1)/2);
		int max=0;
		String max_word="";
		String s1[]=new String[m];
		int z=0;
		for(int x=0;x<s.length();x++)
		{
			for(int y=x+1;y<=s.length();y++)
			{
				
				s1[z]=s.substring(x,y);
				z++;
			}
		}
		
		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			StringBuffer sb=new StringBuffer(word);
			sb.reverse();
			String s3=sb.toString();
			if(word.equals(s3))
			{
				if(max<=word.length())
				{
					if(max<word.length())
					{
						max=word.length();
						max_word=max_word+word+" ";
					}
					else
						max_word=word+" ";
				}
					
				
			}
		}
		System.out.println(max_word);	
		
		
	}
}


//aba