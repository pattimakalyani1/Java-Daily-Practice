class Str2
{
	public static void main(String [] args)
	{
		String s="abc";
		int count=0;
		int n=s.length();
		for(int x=0;x<s.length();x++)
		{
			for(int y=x+1;y<=s.length();y++)
			{
				count++;
				//System.out.println(s.substring(x,y));
			}
		}
		System.out.println("no of substrings : "+count);
		System.out.println(n*(n+1)/2);//6
	}
}


//no of substrings : 6
//6