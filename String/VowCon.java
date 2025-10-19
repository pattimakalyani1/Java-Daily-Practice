import java.util.Arrays;
class VowCon
{
	public static void main(String[] args)
	{
		String s=new String("hello all");
		System.out.println(s);
		char[] a=s.toCharArray();
		int v=0,c=0;
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]=='a'||a[x]=='u'||a[x]=='o'||a[x]=='i'||a[x]=='e'||a[x]=='A'||a[x]=='E'||a[x]=='O'||a[x]=='I'||a[x]=='U')
				v++;
			else if (a[x]==' ');
			else
				c++;
		}
		System.out.println("no of vowles is "+v);
		System.out.println("no of consonants is "+c);
	}
}
				

/*

hello all
no of vowles is 3
no of consonants is 5

*/