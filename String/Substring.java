class Substring
{
	public static void main(String [] args)
	{
		String s="abc";			
		for(int x=0;x<s.length();x++)
		{
			for(int y=x+1;y<=s.length();y++)
			{
				System.out.println(s.substring(x,y));
				
			}
		}
	}
}		
					
							
/*

a
ab
abc
b
bc
c

*/
