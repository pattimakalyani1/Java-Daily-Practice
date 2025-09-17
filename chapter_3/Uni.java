class Uni
{
	public static void main(String [] args)
	{   
		for(int i=0;i<=255;i++)
		{
			char c=(char)(i);
			System.out.println(i+"-"+c);
		}
		
		for(char  c='A';c<='Z';c++)
		{
			
			System.out.println(c+"-"+(int)(c));
		}
		
		for(char i='a';i<='z';i++)
		{
			
			System.out.println(i+"-"+(int)(i));
		}


	}
}	 