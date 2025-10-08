class ArrSym
{
	public static void main(String [] args)
	{
		char ch[]=new char[]{'a','&','e','$','e'};
		System.out.println("before:");
		for(int x=0;x<=ch.length-1;x++)
		System.out.println(ch[x]);
		System.out.println("after:");
		for(int x=0;x<=ch.length-1;x++)
		{
			char c=ch[x];
			if(c>='A' && c<='Z'||c>='a' && c<='z'||c>='0' && c<='9'||c==' ')
			{
				System.out.println(c);
			}
ll			else
			{
				System.out.println("%");
			}
		}
	}
}

/*

before:
a
&
e
$
e
after:
a
%
e
%
e

*/

