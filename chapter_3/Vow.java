class Vow
{
	public static void main(String [] args)
	{
		int count1=0,count=0;
		for(int i=0;i<=127;i++)
		{ 	
			
			if(i>='A' && i<='Z' || i>='a' &&i<='z')
			{
				count++;
			   if(i=='E'||i=='I'||i=='A'||i=='O'||i=='U'||i=='e'||i=='i'||i=='a'||i=='o'||i=='u')
			     {  count1++;
			
			      }
			    
			}
		}System.out.println("no of consonants:"+( count-count1));

	}
}