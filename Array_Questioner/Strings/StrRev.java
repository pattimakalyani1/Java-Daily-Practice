class StrRev
{
	public static void main(String [] args)
	{
		String s=new String("hello");
		System.out.println(s);
		char c[]=s.toCharArray();
		String copy="";
		for(int x=c.length-1;x>=0;x--)
		{
			copy=copy+c[x];
		}
		System.out.println("reverse of string :"+copy);
	}
}
	
/*

hello
reverse of string :olleh

*/		