import java.util.Arrays;
class Ulns
{
	public static void main(String[] args)
	{
		String s=new String("hello all 123 &^5");
		System.out.println(s);
		char[] a=s.toCharArray();
		int b=0,A=0,n=0,s1=0;
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]>='a' && a[x]<='z')
				b++;
			else if (a[x]>='A' && a[x]<='Z')
				A++;
			else if(a[x]>='0' && a[x]<='9')
				n++;
			else if(a[x]==' ');
			else
				s1++;
		}
		System.out.println("no of upper case: "+A);
		System.out.println("no of lower case: "+b);
		System.out.println("no of numbers: "+n);
		System.out.println("no of symbols: "+s1);

	}
}


/*

hello all 123 &^5
no of upper case: 0
no of lower case: 8
no of numbers: 4
no of symbols: 2

*/