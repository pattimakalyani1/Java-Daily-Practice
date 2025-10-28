

class Str6
{
	public static void main(String [] args)
	{
		String s="hello all";
		String word="";
		String s1="";	
		int max=0;
		String max_word="";		
		for(int x=0;x<s.length();x++)
		{
			int count=0;
			for(int y=x+1;y<=s.length();y++)
			{
				s1=s.substring(x,y);
				for(int z=0;z<s1.length();z++)
				{
					char c=s1.charAt(z);
					if(s1.indexOf(c)==s1.lastIndexOf(c))
					{
						count++;
					}
					if(count==0)
					{
						System.out.println(s1);
					}
				}
			}
		}
	}
}
	



class Str7
{
	public static void main(String [] args)
	{
		String s="abc11b12c13";
		int k=0;String ch="";
		for(int x=0;x<s.length();x++)
		{
				
			char c=s.charAt(x);
			if(Character.isDigit(c))
			{
				k=k*10+Character.getNumericValue(c);
			     if(x!=s.length()-1 && !Character.isDigit(s.charAt(x+1)))
			     {
				for(int y=1;y<=k;y++)
				{
					System.out.print(ch);							
				}		
			     }
			}
			else
			{
				ch=ch+c;
				k=0;		
			}
			if(x==s.length()-1 && Character.isDigit(c))
			{
				for(int y=1;y<=k;y++)
				{
					System.out.print(ch);							
				}

			}
			
		}
	}
}




class Str1
{
	public static void main(String [] args)
	{
		String s="a11b12c13";
		int k=0;char ch=' ';
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(Character.isDigit(c))
			{
				k=k*10+Character.getNumericValue(c);
			}
			else
			{
				for(int y=1;y<=k;y++)
				{
					System.out.print(ch);							
				}
				ch=c;
				k=0;		
			}
			if(x==s.length()-1 && Character.isDigit(c))
			{
				for(int y=1;y<=k;y++)
				{
					System.out.print(ch);							
				}

			}
			
		}
	}
}



//aaaaaaaaaaabbbbbbbbbbbbccccccccccccc


		
























		
				










				
						