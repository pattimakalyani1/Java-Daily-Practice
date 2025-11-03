class Strcompression
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




class Strcompression2
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


		
























		
				










				
						