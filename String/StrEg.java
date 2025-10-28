class StrEg
{
	public static void main(String [] args)
	{
		String s="a1b2c3";
		char [] c=s.toCharArray();
		int sum=0;
		for(int x=0;x<=c.length-1;x++)
		{
			if(c[x]>='0' && c[x]<='9')
			{
				sum=sum+(c[x]-'0');
			}
		}
		System.out.println(sum);
	}
}


//6



class StrEg1
{
	public static void main(String [] args)
	{
		String s="aschi";
		String s1="";
		char [] c=s.toCharArray();
		for(char temp:c)
		{
			s1=s1+(int)(temp)+" ";
		}
		System.out.println(s1);
	}
}

//97 115 99 104 105
	
			
