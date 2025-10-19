import java.util.Arrays;
class StrRev
{
	public static void main(String[] args)
	{
		String s=new String("hello all");
		System.out.println(s);
		char[] a=s.toCharArray();
		String copy="";
		for(int x=a.length-1;x>=0;x--)
		{	
			copy=copy+a[x];
		}
		System.out.println("reverser of string is "+copy);
	}
}


/*

hello all
reverser of string is lla olleh

*/