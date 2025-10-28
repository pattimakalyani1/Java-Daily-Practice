class Strreverse
{
	public static void main(String [] args)
	{
		String s="hello all good morning";
		String s1[]=s.split(" ");
		String s2="";
		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			if(x%2==0)
			{
				s2=s2+word+" ";
			}
			else
			{
				StringBuffer sb=new StringBuffer(word);
				sb.reverse();
				String s3=sb.toString();
				s2=s2+s3+" ";
			}
		}
		System.out.println(s2);
	}
}


//hello lla good gninrom				
