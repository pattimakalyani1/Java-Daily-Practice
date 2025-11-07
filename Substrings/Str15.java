class Str15
{
	public static void main(String [] args)
	{
		String s="abababa";
		String sub="aba";
		int count=0;
		for(int x=0;x<s.length();x++)
		{
			for(int y=x+1;y<=s.length();y++)
			{
				if((s.substring(x,y)).equals(sub))
					count++;
			}
		}System.out.println("count occurences of a substring in a string :"+count);
	}
}

//count occurences of a substring in a string :3