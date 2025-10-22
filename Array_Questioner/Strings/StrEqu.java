class StrEqu
{
	public static void main(String [] args)
	{
		String s=new String("hello");
		String s1=new String("hello");
		System.out.println(s.equals(s1));
		boolean b=false;
		char c[]=s.toCharArray();
		char c1[]=s1.toCharArray();
		for(int x=0;x<=c.length-1;x++)
		{
			if(c[x]==c[x])
			{
				b=true;
			}
		}
		System.out.println(b?"true":"false");


	}
}

/*

true
true

*/