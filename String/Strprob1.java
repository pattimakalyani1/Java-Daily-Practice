class StrProb1
{
	public static void main(String [] args)
	{
		String s="hello all good morning";
		String [] a=s.split(" ");
		String s1="";
		for(String temp:a)
		{
			String word=temp;
			char [] c=word.toCharArray();
			for(int x=0;x<=c.length-1;x++)	
			{
				if(x==0||x==c.length-1)
				{
					c[x]=(char)(c[x]-32);
				}
				else;
				s1=s1+c[x];
			}
			s1=s1+" ";
		}
		System.out.println(s1);
	}
}


/*

HellO AlL GooD MorninG


*/				
		
		