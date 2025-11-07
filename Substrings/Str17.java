class Str17
{
	public static void main(String [] args)
	{
		String s="abc";
		int count=0;
		for(int x=0;x<s.length();x++)
		{
			for(int y=x+1;y<=s.length();y++)
			{
				String s2=s.substring(x,y);
				if(s2.contains("e") ||s2.contains("a") ||s2.contains("i") ||s2.contains("o") ||s2.contains("u") ||s2.contains("E") ||s2.contains("I") ||s2.contains("O") ||s2.contains("U") ||s2.contains("A"))
				{
					System.out.println(s2);
					count++;
				}
			}
		}System.out.println("no of substrings: "+count);
	}
}


/*

aa
ab
abc
no of substrings: 3

*/




		