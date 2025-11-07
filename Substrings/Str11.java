class Str11
{
	public static void main(String [] args)
	{
		String s="abcab";
		String s2="";	
		int count=0;
		for(int x=0;x<s.length();x++)
		{
			for(int y=x+1;y<=s.length();y++)
			{
				 s2=s.substring(x,y);
				char c[]=s2.toCharArray();
				if(c[0]==c[c.length-1])
				{
					count++;
					System.out.println(s2);
				}			
			}
		}System.out.println("no of substrings that startswith and endswith :"+ count);
	}
}			
				

/*

a
abca
b
bcab
c
a
b
no of substrings that startswith and endswith :7


*/