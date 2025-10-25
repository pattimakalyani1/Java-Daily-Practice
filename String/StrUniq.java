class StrUniq
{
	public static void main(String [] args)
	{
		String s="hello all good";
		String s2="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(s.indexOf(ch)==s.lastIndexOf(ch))
			{
				System.out.println(ch);
			}
			
		}
		
	}
}

/*

h
e
o
a
g
d

*/


class StrUniq1
{
	public static void main(String [] args)
	{
		String s="ApPle12";
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(ch>='A' && ch<='Z')
				s1=s1+(char)(ch+32);
			else if(ch>='a' && ch<='z')
				s1=s1+(char)(ch-32);
		}
		System.out.println(s1);
	}
}


/*

aPpLE


*/
