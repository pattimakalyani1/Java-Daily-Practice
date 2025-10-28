class MaxLenStr
{
	public static void main(String [] args)
	{
		String s="hello all an good morning ";
		int min=Integer.MAX_VALUE;		
		String s1[]=s.split(" ");
		int l[]=new int[s1.length];
		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			if(min>word.length())
				min=word.length();
			l[x]=word.length();
		}
		for(int x=0;x<=l.length-1;x++)
		{
			if(min==l[x])
				System.out.println(s1[x]);
		}
	}
}
