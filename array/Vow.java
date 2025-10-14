class Vow
{
	public static void main(String[] args)
	{
		char c[]=new char[]{'a','e','t','y','u'};
		for(int x=0;x<=c.length-1;x++)
		{
			if(c[x]=='a'||c[x]=='e'||c[x]=='i'||c[x]=='o'||c[x]=='u')
			{
				System.out.println(c[x]);
			}
		}
	}
}

//using methods:

class Vow1
{
	public static void main(String[] args)
	{
		char c[]=new char[]{'a','e','t','y','u'};
		Vow1 v=new Vow1();
		char [] d=v.printVow(c);
		for(char temp:d)
			System.out.print(temp+" ");
	}
	char [] printVow(char [] c)
	{
		char b[]=new char[c.length];
		int count=0;
		for(int x=0;x<=c.length-1;x++)
		{
			if(c[x]=='a'||c[x]=='e'||c[x]=='i'||c[x]=='o'||c[x]=='u')
			{
				
				b[count]=c[x];
				count++;
			}
		}
		return b;
	}
		
	
}

/*

a e u

*/


class Vow2
{
	public static void main(String[] args)
	{
		char c[]=new char[]{'a','e','t','y','u'};
		Vow2 v=new Vow2();
		System.out.println("char array:");
		for(char temp:c)
			System.out.print(temp+" ");
		System.out.println();
		System.out.println("vowels in a array:");
		v.printVow(c);
	}
	void printVow(char [] c)
	{
		
		int count=0;
		for(int x=0;x<=c.length-1;x++)
		{
			if(c[x]=='a'||c[x]=='e'||c[x]=='i'||c[x]=='o'||c[x]=='u')
			{
				
				System.out.print(c[x]+" ");
			}
		}
		
	}
		
	
}
/*
char array:
a e t y u
vowels in a array:
a e u

*/


