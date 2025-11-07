class Str9
{
	public static void main(String [] args)
	{
		String s="good morning";
		String s1[]=s.split(" ");
		
		String s3="";
		for(int x=0;x<s1.length;x++)
		{	
			String s2="";
			String word=s1[x];
			for(int y=0;y<word.length();y++)
			{
				char c=word.charAt(y);
				s2=c+s2;
			}
			s3=s3+s2+" ";
						
			
		}System.out.print(s3);
	}
}


//doog gninrom