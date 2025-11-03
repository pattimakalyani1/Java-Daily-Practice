class Str4
{
	public static void main(String [] args)
	{
		String s="abc";
		int n=s.length();
		int m=(n*(n+1)/2);
		char c='a';
		String s3=""+c;
		String s1[]=new String[m];
		int z=0;
		int x=0;
		for(x=0;x<s.length();x++)
		{
			for(int y=x+1;y<=s.length();y++)
			{
				
				s1[z]=s.substring(x,y);
				z++;
			}
		}
		int count=0;
		for(String temp:s1)
		{
			if(temp.contains(s3))
				count++;
		}
		String s2[]=new String[count];
		int z1=0;
		for(String temp:s1)
		{
			if(temp.contains(s3))
			{
				s2[z1]=temp;
				z1++;
			}
		}
		//for(String temp1:s2)
			//System.out.println(temp1);
		int min=Integer.MAX_VALUE;
		String min_word="";
		for(String temp1:s2)
		{
			if(min>temp1.length())
			{
				min=temp1.length();
				min_word=temp1;
			}
		}
		System.out.println(min_word);
	}
}


//a