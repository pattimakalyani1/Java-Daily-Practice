class StrVow
{
	public static void main(String [] args)
	{
		String s=new String("vital info resource under seize");
		String a[]=s.split(" ");
		for(int x=0;x<=a.length-1;x++)
		{
			String word=a[x];
			System.out.println(word);
			for(int y=0;y<word.length();y++)
			{
				if(word.charAt(y)=='a'||word.charAt(y)=='e'||word.charAt(y)=='i'||word.charAt(y)=='o'||word.charAt(y)=='u')
				{
					System.out.println(word.charAt(y));
				}
			}
		}	
	}
}


/*

vital
i
a
info
i
o
resource
e
o
u
e
under
u
e
seize
e
i
e

*/



class StrVow1
{
	public static void main(String [] args)
	{
		String s=new String("vital info resource under seize");
		String a[]=s.split(" ");
		for(int x=0;x<=a.length-1;x++)
		{
			String word=a[x];
			System.out.println(word);
			System.out.println((word.CharAt(0)).toUpperCase());						
}	
	}
}

