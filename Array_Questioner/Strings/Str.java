import java.util.Arrays;
class Str
{
	public static void main(String [] args)
	{
		String s1="listen";
		String s2="silent";
		int count=0;
		if(s1.length()==s2.length())
		{
			char c[]=s1.toCharArray();
			char d[]=s2.toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);
			for(int x=0;x<=c.length-1;x++)
			{
				if(c[x]!=d[x])
				{
					count++;
					break;
				}
			}
			System.out.println(count==0?"anagram":"not anagram");
						
		}
		else
			System.out.println("anagram");
	}
}