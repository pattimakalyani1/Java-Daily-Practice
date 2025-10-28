class Largestsubstring
{
	public static void main(String [] args)
	{
		String s="abc";
		int max=0;
		String max_word="";
		String s1="";			
		for(int x=0;x<s.length();x++)
		{
			int count=0;
			for(int y=x+1;y<=s.length();y++)
			{
				s1=s.substring(x,y);
				count=s1.length();
				
			}
			if(max<count)
			{
				max=count;
				max_word=s1;
			}
			
		}System.out.println(max_word+" "+max);
	}
}		


//abc 3
