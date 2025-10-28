class Strlargesmal
{
	public static void main(String [] args)
	{
		String s="hello all mornings morning Good";
		String s1[]=s.split(" ");
		String l=s1[0];
		String s2=s1[0];
		for(int x=1;x<=s1.length-1;x++)
		{
			
			int y=l.compareTo(s1[x]);
			int z=s2.compareTo(s1[x]);
			if(y<0)
				l=s1[x];
			if(z>0)
				s2=s1[x];
		}
		System.out.println( "largest string: "+l);
		System.out.println("smallest string : "+s2);
	}
}


/*

largest string: mornings
smallest string : Good


*/