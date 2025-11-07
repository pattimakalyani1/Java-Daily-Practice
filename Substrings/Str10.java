class Str10
{
	public static void main(String [] args)
	{
		String s="hello all";
		String s3="all";
		boolean b=false;
		for(int x=0;x<s.length();x++)
		{
			for(int y=x+1;y<=s.length();y++)
			{
				if(s3.equals(s.substring(x,y)))			
				{
					b=true;
					break;
				}
					
			}
		}
		if(b)
			System.out.println("it is found");
	}
}
			
//it is found