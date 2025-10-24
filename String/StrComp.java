import java.util.Arrays;
class StrComp
{
	public static void main(String [] args)
	{
		String s="Hello";
		String s1="Hello";
		int count=0;
		System.out.println(s.equals(s1)?"equal":"not equal");
		char [] c=s.toCharArray();
		char [] c1=s1.toCharArray();
		for(int x=0;x<=c.length-1;x++)
		{
			if(c[x]!=c1[x])
			{
				count++;
				break;
			}
		}
		System.out.println(count==0?"equal":"not equal");
	}
}


/*

equal
equal

*/