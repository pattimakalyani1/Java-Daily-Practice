import java.util.Arrays;
class Freq
{
	public static void main(String [] args)
	{
		String s=new String("hello all");
		char c[]=s.toCharArray();
		int count=0;
		int c1[]=new int[c.length];
		boolean b[]=new boolean[c.length];
		for(int x=0;x<c.length-1;x++)
		{
			count=1;
			if(b[x]==true)
				continue;
			for(int y=x+1;y<=c.length-1;y++)
			{
				if(c[x]==c[y])
				{
					b[y]=true;
					count++;
				}
				
			
			}
			System.out.println(c[x]+":"+count);
			
		}
		
	}
}


/*


h:1
e:1
l:4
o:1
 :1
a:1

*/


class Str
{
	public static void main(String [] args)
	{
		String s="a1b2c3";
		String s1="";
		for(int x=s.length()-1;x>=0;x--)
		{
			char c=s.charAt(x);
			if(Character.isDigit(c))
			{
				s1=s1+c;
			}
		}
		System.out.println(s1);
	}
}
	
//321




//unique
class Freq1
{
	public static void main(String [] args)
	{
		String s=new String("hello all good all morning morning");
		String s1[]=s.split(" ");
		int count=0;
		boolean b[]=new boolean[s1.length];
		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			if(b[x]==true)
				continue;
			count=0;
			for(int y=x+1;y<=s1.length-1;y++)
			{
				String word1=s1[y];
				if(word.equals(word1))
				{
					b[y]=true;
					count++;
				}
			}
			
			if(count==0)
				System.out.println(s1[x]);
			
		}
	}
}

//hello
//good

	
//duplicate
class Freq2
{
	public static void main(String [] args)
	{
		String s=new String("hello all good all morning morning");
		String s1[]=s.split(" ");
		int count=0;
		boolean b[]=new boolean[s1.length];
		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			if(b[x]==true)
				continue;
			count=0;
			for(int y=x+1;y<=s1.length-1;y++)
			{
				String word1=s1[y];
				if(word.equals(word1))
				{
					b[y]=true;
					count++;
				}
			}
			
			if(count>0)
				System.out.println(s1[x]);
			
		}
	}
}

//all
//morning


class Freq3
{
	public static void main(String [] args)
	{
		String s=new String("hello all good all morning morning");
		String s1[]=s.split(" ");
		int count=0;
		boolean b[]=new boolean[s1.length];
		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			if(b[x]==true)
				continue;
			count=0;
			for(int y=x+1;y<=s1.length-1;y++)
			{
				String word1=s1[y];
				if(word.equals(word1))
				{
					b[y]=true;
					count++;
				}
			}
			
			if(b[x]==false)
				System.out.println(s1[x]);
			
		}
	}
}

//hello
//all
//good 
//morning
		

class Rev
{
	public static void main(String [] args)
	{
		String s="hello";
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			s1=c+s1;
		}
		System.out.println(s1);
	}
}


class Rev1
{
	public static void main(String [] args)
	{
		String s="hello";
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			s1=c+s1;
		}
		//System.out.println(s1);
	
	if(s1.equals(s))
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");
	}
	
}



class Vc
{
	public static void main(String [] args)
	{
		String s="hello123$%";
		int countv=0,countc=0;
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(Character.isLetter(c))
			{
				if(c=='i'||c=='e'||c=='a'||c=='o'||c=='u'||c=='I'||c=='E'||c=='A'||c=='O'||c=='U')
				{
					countv++;
				}
				else
					countc++;
			}
		}
		System.out.println("no of vowels" + countv);
		System.out.println("no of consonants" +countc);
	}
}



class FirUnq
{
	public static void main(String [] args)
	{
		String s="hhello all$%";
		char c[]=s.toCharArray();
		int count=0;
		String copy="";
		boolean b[]=new boolean[c.length];
		for(int x=0;x<=c.length-1;x++)
		{
			if(b[x]==true)
				continue;
			for(int y=x+1;y<=c.length-1;y++)
			{
				if(c[x]==c[y])
				{
					b[y]=true;
					count++;
				}
			}
			if(count==0)
			{
				copy=copy+c[x];
				break;
			}
		}System.out.println(copy);
	}
}
	
		
































