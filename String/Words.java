import java.util.Arrays;
class Words
{
	public static void main(String[] args)
	{
		String s=new String("hello all");
		System.out.println(s);
		char[] a=s.toCharArray();
		int spaces=0;
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]==' ')
				spaces++;
		}
		System.out.println("No of words in a String: "+(spaces+1));
	}

}

/*

hello all
No of words in a String: 2

*/