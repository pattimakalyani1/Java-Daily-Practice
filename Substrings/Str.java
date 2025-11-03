class Freq1
{
	public static void main(String [] args)
	{
		String s="a quick brown fox jumps ovep the lazy dog";
		char c[]=s.toCharArray();
		int count=0;
		for(char x='a';x<='z';x++)
		{
			boolean found=false;
			count=0;
			for(int y=0;y<=c.length-1;y++)
			{
				if(x==c[y])
				{
					found=true;
					break;
				}
			}
			if(found==false)
			{
				count++;
				System.out.println(x);
			}
		}
	}
}
