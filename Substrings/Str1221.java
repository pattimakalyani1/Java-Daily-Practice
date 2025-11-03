class Str12
{
	public static void main(String [] args)
	{
		String s="hello";
		String s1=new String("hello");
		System.out.println("s "+System.identityHashCode(s));
		 s=s+"all";
		System.out.println("s "+System.identityHashCode(s));
		//System.out.println("s1 "+System.identityHashCode(s1));
		
	}
}


class Str1
{
	public static void main(String [] args)
	{
		String s="heloeo good morning";
		String s1[]=s.split(" ");
		//boolean b[]=new boolean[s1.length];
		for(int x=0;x<s1.length;x++)
		{	
			String word=s1[x];
			for(int y=0;y<word.length();y++)
			{
			char c=word.charAt(y);
			if(c=='i'||c=='a'||c=='e'||c=='o'||c=='u')
			{
				if(word.indexOf(c)!=word.lastIndexOf(c))
				{
					
					System.out.println(word);
					break;
				}
			}
			}
		}
	}
}
			
			
	
class 	Str2
{
	public static void main(String [] args)
	{
		String s="hello all good morning";
		int max=Integer.MIN_VALUE;
		int secmax=max;
		String s4="";
		String s3="";
		String s1[]=s.split(" ");
		for(int x=0;x<s1.length;x++)
		{
			if(max<s1[x].length())
			{
				
				secmax=max;
				max=s1[x].length();
				s3=s4;
				s4=s1[x];
			}
			else if(max!=s1[x].length() && secmax<s1[x].length())
			{
				secmax=s1[x].length();
				s3=s1[x];
			}
		}
		System.out.println(s3);
	}
}
		
		































		
	
		