class Uniqsubstring
{
	public static void main(String [] args)
	{
		String s="hello";
		String word="";
		String s1="";	
		int max=0;
		String max_word="";		
		for(int x=0;x<s.length();x++)
		{
			for(int y=x+1;y<=s.length();y++)
			{
				s1=s.substring(x,y);//h//he//hel//hell//hello
				String s3="";			
				
				for(int z=0;z<s1.length();z++)//h//he//hel/hell
				{
					char c=s1.charAt(z);//h//h//e//h//e//l
					if(s1.indexOf(c)!=s1.lastIndexOf(c))//l
					{
						if(s3.indexOf(c)==-1)
						{
							s3=s3+c;//l
							break;
						}
					}
				}

				if(s3.length()==0)
				{
					System.out.println(s1);//h//he//hel
				}
			}
		}
	}
}
