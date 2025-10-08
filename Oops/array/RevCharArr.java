class RevCharArr
{
	public static void main(String [] args)
	{
	char c[]=new char[]{'x','S','D','f','g','T'};
	System.out.println("before:");
	for(int x=0;x<=c.length-1;x++)
	System.out.println(c[x]);
	System.out.println("after:");
	for(int x=c.length-1;x>=0;x--)
	System.out.println(c[x]);
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
T
g
f
D
S
x

*/