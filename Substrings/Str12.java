class Str1
{
	public static void main(String [] args)
	{
		String s="hello1 all2 good3 mornin4g5";
		String s1[]=s.split(s);
		int k=0;
		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			System.out.println(word);
			char c1[]=word.toCharArray();
			for(int z=0;z<=c1.length-1;z++)
			{				
				if(c1[z]>='0' && c1[z]<='9')
				{
					System.out.println("helo");
					int num=(char)(c1[z]-'0');
					System.out.println(num);
					k=k*10+num;
				}
			}
			
		}
		
	}
}
					
		