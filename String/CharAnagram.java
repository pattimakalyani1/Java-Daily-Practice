import java.util.Arrays;
class CharAnagram
{
	public static void main(String [] args)
	{
		String s=new String("acct");
		String s1=("ctat");
		char a[]=s.toCharArray();
		char b[]=s.toCharArray();
		int count=0;
		if(a.length==b.length)
		{
			for(int x=0;x<=a.length-1;x++)
			{
				for(int y=0;y<=b.length-1;y++)
				{
					if(a[x]==a[y])
					{
						count++;
					}
				}
			}
		System.out.println(count==a.length?"anagram":"not anagram");
		}
		else
			System.out.println("not anagram");
	}
}

/*

not anagram

*/