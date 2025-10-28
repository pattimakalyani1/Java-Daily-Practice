class Uniqsubstring
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
				String s3="";			
				
				for(int z=0;z<s1.length();z++)
				{
					char c=s1.charAt(z);
					if(s1.indexOf(c)!=s1.lastIndexOf(c))
					{
						if(s3.indexOf(c)==-1)
						{
							s3=s3+c;
							break;
						}
					}
				}

				if(s3.length()==0)
				{
					System.out.println(s1);
				}
			}
		}
	}
}
