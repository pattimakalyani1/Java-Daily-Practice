class Str1
{
	public static void main(String [] args)
	{
		String s1="hello all good morning";
		String s=s1.toUpperCase();
		String [] a=s.split(" ");
		String b="";
		for(int x=0;x<=a.length-1;x++)
		{
			String word=a[x];
			for(int y=0;y<word.length();y++)
			{
				if(y==0)
				{
					b=b+word.charAt(y);
				}
			}
		}
		System.out.println(b);
	}
}
				
/*

HAGM

*/

//or

class Str1
{
	public static void main(String [] args)
	{
		String s="hello all good morning";
		String [] a=s.split(" ");
		String b="";
		for(int x=0;x<=a.length-1;x++)
		{
			String word=a[x];
			for(int y=0;y<word.length();y++)
			{
				if(y==0)
				{
					b=b+(char)(word.charAt(y)-32);
				}
			}
		}
		System.out.println(b);
	}
}
				
			