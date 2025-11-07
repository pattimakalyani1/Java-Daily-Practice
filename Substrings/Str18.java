class Str18
{
	public static void main(String [] args)
	{
		String s="welcome to codinghub";
		String s1[]=s.split(" ");
		String s2="";
		String s3="";
		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			for(int y=0;y<word.length();y++)
			{
				char c=word.charAt(y);
				if(Character.isLetter(c))
				{
					if(!(c=='E'||c=='A'||c=='I'||c=='O'|c=='U'||c=='e'||c=='i'||c=='o'||c=='u'||c=='a'))
						s2=s2+c;
				}
			}
			s2=s2+" ";
		}System.out.println(s2);
	}
}
			
	
//wlcm t cdnghb			
			


class Str1
{
	public static void main(String [] args)
	{
		String s="welcome to codinghub";				
		System.out.println(s.replace(" ","-"));
	}
}

class Str12
{
	public static void main(String [] args)
	{
		String s="welcome to codinghub";
		String s1[]=s.split(" ");
		String s2="";
		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			if(x==s1.length-1)
				s2=s2+word;
			else
				s2=s2+word+"-";
		}
		System.out.println(s2);
	}
}

//welcome-to-codinghub
			
					
		
