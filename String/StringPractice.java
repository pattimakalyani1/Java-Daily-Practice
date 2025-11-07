import java.util.Arrays;
class StringPractice
{
	public static void main(String [] args)
	{
		String s="hello123%$";
		//char c[]=s.toCharArray();
		int countc=0,countv=0;
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(Character.isLetter(c))
			{
				if(c=='i'||c=='e'||c=='a'||c=='o'||c=='u'||c=='E'||c=='I'||c=='A'||c=='O'||c=='U')
				{
					countv++;
				}
				else
					countc++;
			}
		}
		System.out.println("no of vowels: "+countv);
		System.out.println("no of consonants: "+countc);
	}
}

/*
no of vowels: 2
no of consonants: 3	

*/


class Str1
{
	public static void main(String [] args)
	{
		String s="heLlo12@3$%";
		int countU=0,countL=0,countD=0,countS=0;
		for(int x=0;x<s.length();x++)
		{
			char c=	s.charAt(x);
			if(Character.isUpperCase(c))
			{
				countU++;
			}
			else if(Character.isLowerCase(c))
			{
				countL++;
			}
			else if(Character.isDigit(c))
			{
				countD++;
			}
			else if(c==' ');
			else
				countS++;
		}
		System.out.println(countU+" "+countL+" "+countD+" "+countS);
	}
}
	


class Str2
{
	public static void main(String [] args)
	{	
		String s="hEllo";
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(Character.isUpperCase(c))
			{
				s1=s1+(Character.toLowerCase(c));
			}
			else if(Character.isLowerCase(c))
			{
				s1=s1+(Character.toUpperCase(c));
			}
			
		}System.out.println(s);
		System.out.println(s1);
	}
}


class Str3
{
	public static void main(String [] args)
	{
		String s="hello all good morning ";
		char c[]=s.toCharArray();
		int count=0;
		boolean b[]=new boolean[c.length];
		for(int x=0;x<=c.length-1;x++)
		{
			if(b[x]==true)
				continue;
			count=0;
			for(int y=x+1;y<=c.length-1;y++)
			{
				if(c[x]==c[y])
				{
					count++;
					b[y]=true;
				}
			}
		
			if(b[x]==false)
			{
				System.out.println(c[x]+":"+count);
			}
			
		}
	}
}	

/*

h:0
e:0
l:3
o:3
 :3
a:0
g:1
d:0
m:0
r:0
n:1
i:0

*/

class Str4
{
	public static void main(String [] args)
	{
		String s="hello all good morning";
		char c[]=s.toCharArray();
		boolean b[]=new boolean[c.length];
		int count=0;
		for(int x=0;x<=c.length-1;x++)
		{
			if(b[x]==true)
				continue;
			count=0;
			for(int y=x+1;y<=c.length-1;y++)
			{
				if(c[x]==c[y])
				{
					count++;
					b[y]=true;
				}
			}
			if(count>0)
			{
				System.out.println(c[x]);
			}
		}
	}
}

/*

l
o

g
n

*/


class Str5
{
	public static void main(String [] args)
	{
		String s="hello all morning";
		char c[]=s.toCharArray();
		boolean b[]=new boolean[c.length];
		int count=0;
		for(int x=0;x<=c.length-1;x++)
		{
			if(b[x]==true)
				continue;
			count=0;
			for(int y=x+1;y<=c.length-1;y++)
			{
				if(c[x]==c[y])
				{
					count++;
					b[y]=true;
				}
			}
			if(count==0)
			{
				System.out.println(c[x]);
			}
		}
	}
}


/*

h
e
a
m
r
i
g

*/


class Str6
{
	public static void main(String [] args)
	{
		String s="hello all good morning";
		char c[]=s.toCharArray();
		char search='a';
		boolean b=true;
		for(int x=0;x<=c.length-1;x++)
		{
			if(search==c[x])
			{
				b=false;
				break;
			}
		}
		if(b==false)
			System.out.println("search is found");
		else
			System.out.println("search is not found");
	}
}

//search is found


class Str7
{
	public static void main(String [] args)
	{
		String s="hello all morning";
		char c[]=s.toCharArray();
		boolean b[]=new boolean[c.length];
		int count=0;
		for(int x=0;x<=c.length-1;x++)
		{
			if(b[x]==true)
				continue;
			count=0;
			for(int y=x+1;y<=c.length-1;y++)
			{
				if(c[x]==c[y])
				{
					count++;
					b[y]=true;
					
				}
			}
			if(count==0)
			{
				System.out.println(c[x]);
				break;
			}
		}
	}
}

//h


class Str8
{
	public static void main(String [] args)
	{
		String s="M$A12D#A1M";
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(Character.isLetter(c))
			{
				s1=s1+c;
				
			}
		}
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		String s3=sb.toString();
		//System.out.println(s3);
		if(s3.equals(s1))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	
	}
}

//palindrome


class Str9
{
	public static void main(String [] args)
	{
		String s="haii";
		System.out.println(s+":"+System.identityHashCode(s));
		s=s+"all";
		System.out.println(s+":"+System.identityHashCode(s));
	}
}

/*

haii:798154996
haiiall:303563356

*/


class Str10
{
	public static void main(String [] args)
	{
		String s="listen";
		String s1="silent";
		if(s.length()==s1.length())
		{
		char c[]=s.toCharArray();
		char c1[]=s1	.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		boolean b=true;
		for(int x=0;x<=c.length-1;x++)
		{
			if(c[x]!=c1[x])
			{
				b=false;
			}
		}
		if(b)
			System.out.println("anagram");
		else
			System.out.println("nor anagram");
		}
		else
			System.out.println("not anagram");
	}
}

//anagram


class Str11
{
	public static void main(String [] args)
	{
		String s=" a quick brown ox jmups over the lazy dog";
		char c[]=s.toCharArray();
		boolean b=true;
		for(char x='a';x<='z';x++)
		{
			b=true;
			for(int y=0;y<=c.length-1;y++)
			{
				if(x==c[y])
				{
					b=false;	
					break;
				}
			}
			if(b)
				System.out.println(x);
		}
	}
}
//f
//v


class Str12
{
	public static void main(String [] args)
	{
		String s="hello all good morning";
		char c[]=s.toCharArray();
		boolean b[]=new boolean[c.length];
		int count=0;
		int most_rep[]=new int[c.length];
		int most_rep1=0;
		
		for(int x=0;x<=c.length-1;x++)
		{
			if(b[x]==true)
				continue;
			count=0;
				for(int y=x+1;y<=c.length-1;y++)
				{
					if(c[x]==c[y])
					{
						b[y]=true;
						count++;
					}
				}
				most_rep[x]=count;
				if(most_rep1<count)
				{
					most_rep1=count;
				}
		}
		for(int x=0;x<=c.length-1;x++)
		{
			if(most_rep[x]==most_rep1)
				System.out.println(c[x]);
		}
	}
}

/*

l
o

*/


class Str13
{
	public static void main(String [] args)
	{
		String s="hello";
		System.out.println(s+" :"+System.identityHashCode(s));
		String s1=new String("hel");
		System.out.println(s1+" :"+System.identityHashCode(s1));
		s1=s1+"lo";
		System.out.println(s1+" :"+System.identityHashCode(s1));
		s1=s1.intern();
		System.out.println(s1+" :"+System.identityHashCode(s1));
	}
}


/*

hello :798154996
hel :1418481495
hello :135721597
hello :798154996

*/		
				
class Str14
{
	public static void main(String [] args)
	{
		String s="hello all good morning evening";
		String s1[]=s.split(" ");
		int max_length=0;
		String max="";
		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			if(word.length()>=max_length)
			{
				if(word.length()>max_length)
				{
					max_length=word.length();
					max=word+" ";
				}
				else if(word.length()==max_length)
					max=max+word+" ";
			}
		}
		System.out.println(max);
	}
}

//morning evening



class Str15
{
	public static void main(String [] args)
	{
		String s="hello all good morning";
		String s1[]=s.split(" ");
		String s2="";
		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			if(x%2==0)
			{
				s2=s2+word.toUpperCase();
			}
			else
				s2=s2+word.toLowerCase();
			s2=s2+" ";
		}
		System.out.println(s2);
	}
}

//HELLO all GOOD morning



class Str16
{
	public static void main(String [] args)
	{
		String s="vital info resuroce under seize";
		String s1[]=s.split(" ");
		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			System.out.println(word);
			for(int y=0;y<word.length();y++)
			{
				char c=word.charAt(y);
				if(Character.isLetter(c))
				{
					if(c=='i'||c=='e'||c=='a'||c=='u'||c=='o'||c=='I'||c=='E'||c=='A'||c=='U'||c=='O')
					{
						System.out.println(c);
					}
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
resuroce
e
u
o
e
under
u
e
seize
e
i
e

*/

class Str17
{
	public static void main(String [] args)
	{
		String s="hello all good morning";
		String s1[]=s.split(" ");
		String s2="";
		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			char c=word.charAt(0);
			s2=s2+(Character.toUpperCase(c));
			
		}System.out.println(s2);
	}
}

//HAGM


class Str18
{
	public static void main(String [] args)
	{
		String s="hello";
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			s1=c+s1;
		}System.out.println(s);
		System.out.println(s1);
	}
}

/*

hello
olleh

*/

class Str19
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
		if(s.equals(s1))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}
}


//not palindrome


class Str20
{
	public static void main(String [] args)
	{
		String s="a man, a plan 1&a canal,panama";
		String s1="";
		
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(Character.isLetter(c))
			{
				s1=s1+c;
			}
		}
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		String s2=s1.toString();
		if(s1.equals(s2))
			System.out.println("palindrome");
	}
}

//palindrome


class Str21
{
	public static void main(String [] args)
	{
		String s="madam arora teaches malayalam";
		String s1="";
		
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(Character.isLetter(c))
			{
				s1=s1+c;
			}
		}
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		String s2=s1.toString();
		if(s1.equals(s2))
			System.out.println("palindrome");
	}
}

//palindrome


class Str22
{
	public static void main(String [] args)
	{
		String s="madam arora teaches malayalam";
		String s1[]=s.split(" ");
		int count=0,max=0;
		String max_word=" ";
		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			char c[]=word.toCharArray();
			for(int y=0;y<=c.length-1;y++)
			{
				if(c[y]=='i'||c[y]=='e'||c[y]=='o'||c[y]=='u'||c[y]=='a'||c[y]=='E'||c[y]=='I'||c[y]=='A'||c[y]=='O'||c[y]=='U')
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				max_word=word;
			}
		}
		System.out.println(max_word);
	}
}

//malayalam


class Str23
{
	public static void main(String [] args)
	{
		String s="hello all good morning";
		String s1[]=s.split(" ");
		String s2="";
		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			char c[]=word.toCharArray();
			for(int y=0;y<=c.length-1;y++)
			{
				if(y==0||y==c.length-1)
				{
					s2=s2+(Character.toUpperCase(c[y]));
				}
				else
					s2=s2+c[y];
			}
			s2=s2+" ";
		}
		System.out.println(s2);
	}
}

//HellO AlL GooD MorninG




class Str24
{
	public static void main(String [] args)
	{
		String s="HellO All GooD MorninG";
		String s1[]=s.split(" ");
		String s2="";
		String s4="";

		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			if(x%2==0)
			{
				StringBuffer sb=new StringBuffer(word);
				sb.reverse();
				String s3=sb.toString();
				s2=s2+s3+" ";
			}
			else
			{
				s4="";
				char c[]=word.toCharArray();
				for(int y=0;y<=c.length-1;y++)
				{
					if(Character.isLowerCase(c[y]))
					{
						s4=s4+(Character.toUpperCase(c[y]));
					}
					else if(Character.isUpperCase(c[y]))
					{
						s4=s4+(Character.toLowerCase(c[y]));
					}
				}
				s2=s2+s4+" ";
			}
				
					
						
				
		}
		System.out.println(s2);
	}
}

//OlleH aLL DooG mORNINg


class Str25
{
	public static void main(String [] args)
	{
		String s="hello all good morning";
		String s1[]=s.split(" ");
		String s2="";

		for(int x=0;x<=s1.length-1;x++)
		{
			if(x==0)
			{
				s2=s2+s1[s1.length-1];
			}
			else if(x==s1.length-1)
			{
				s2=s2+s1[0];
			}
			else
			{
				StringBuffer sb=new StringBuffer(s1[x]);
				sb.reverse();
				String s3=sb.toString();
				s2=s2+s3;
			}
			s2=s2+" ";
		}
		System.out.println(s2);
	}
}

//morning lla doog hello


class Str26
{
	public static void main(String [] args)
	{
		String s="hello all good morning";
		String s1[]=s.split(" ");
		for(int x=0;x<=s1.length-1;x++)
		{
			int count=0;
			String word=s1[x];
			boolean b[]=new boolean[word.length()];
			char c[]=word.toCharArray();
			for(int y=0;y<=c.length-1;y++)
			{
				if(b[y]==true)
					continue;
				count=0;
				for(int z=y+1;z<=c.length-1;z++)
				{
					if(c[y]==c[z])
					{
						b[z]=true;
						count++;
					}
				}
			if(count==0)
				System.out.print(c[y]);
			}
			System.out.println();
		}	
	}
}

/*

heo
a
gd
morig

*/



			
			
				
				
				


				


			

			
		
		

		

			



	
		

		


		
		
			
			





































				
			
	
				