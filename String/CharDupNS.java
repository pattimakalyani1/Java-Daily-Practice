import java.util.Arrays;
class CharDupNS
{
	public static void main(String[] args)
	{
		String s=new String("M$A12D#A1M");
		System.out.println(s);
		char[] a=s.toCharArray();
		String copy="";
		String copy1="";
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]>='A' && a[x]<='Z'||a[x]>='a' && a[x]<='z')
				copy=copy+a[x];
		}
		char [] b=copy.toCharArray();
		for(int x=b.length-1;x>=0;x--)
		{
			copy1=copy1+b[x];
		}	
		System.out.println(copy1.equals(copy)?"palindrome":"not palindrome");
	}
}
				

/*

palindrome

*/
	
class CharDupNS1
{
	public static void main(String[] args)
	{
		String s=new String("M$A12D#A1M");
		System.out.println(s);
		char[] a=s.toCharArray();
		String copy="";
		String copy1="";
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]>='A' && a[x]<='Z'||a[x]>='a' && a[x]<='z')
				copy=copy+a[x];
		}
		char [] b=copy.toCharArray();
		char [] c=new char[b.length];
		for(int x=0,y=b.length-1;x<=b.length-1;x++,y--)
		{
			c[y]=b[x];
		}
		for(int temp:c)
		{
			copy1=copy1+temp;
		}
		System.out.println(copy1.equals(copy)?"palindrome":"not palindrome");
	}
}


/*

M$A12D#A1M
palindrome

*/