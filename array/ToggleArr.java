class ToggleArr
{
	public static void main(String [] args)
	{
	char c[]=new char[]{'x','S','D','f','g','T'};
	System.out.println("before:");
	for(int x=0;x<=c.length-1;x++)
	System.out.println(c[x]);
	System.out.println("after:");
	for(int x=0;x<=c.length-1;x++)
	{
		char ch=c[x];
		if(ch>='A' && ch<='Z')
		{
			char u=(char)(ch+32);
			System.out.println(u);
		}
		else
		{
			char l=(char)(ch-32);
			System.out.println(l);
		}
	}
	}
}

/*

before:
x
S
D
f
g
T
after:
X
s
d
F
G
t

*/