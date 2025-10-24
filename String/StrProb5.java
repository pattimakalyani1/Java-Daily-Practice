//duplicate characters
class StrProb5
{
	public static void main(String [] args)
	{
		String s="hello all good morning";
		String [] a=s.split(" ");
		for(int x=0;x<=a.length-1;x++)
		{
			int y,count=0;
			String word=a[x];
			boolean b[]=new boolean[word.length()];
			
			char c[]=word.toCharArray();
			for(y=0;y<=c.length-1;y++)
			{
				if(b[y]==true)
					continue;
				count=0;
				for(int z=y+1;z<=c.length-1;z++)
				{
					if(c[y]==c[z])
					{
						count++;
						b[z]=true;

					}
				}
			
			if(count>0)
				System.out.print(c[y]);
			}
			System.out.println();
		}
	}
}


/*


l
l
o
n


*/