class StrProb2
{
	public static void main(String [] args)
	{
		String s="Hello All Good Morning ";
		String [] a=s.split(" ");
		String s1="";
		for(int x=0;x<=a.length-1;x++)
		{
			String word=a[x];
			if(x%2==0)
			{
				
				StringBuffer sb=new StringBuffer(word);
				sb.reverse();
				String s2=sb.toString();
				s1=s1+s2+" ";
			}
			else
			{
				char c[]=word.toCharArray();//A l l
				for(int y=0;y<=c.length-1;y++)
				{
					if(c[y]>='a' && c[y]<='z')
					{
						c[y]=(char)(c[y]-32);
						
					}
					else if(c[y]>='A' && c[y]<='Z')
						c[y]=(char)(c[y]+32);
					s1=s1+c[y];
						
				}
				s1=s1+" ";
			}
		}
		System.out.println(s1);
	}
}		
				


/*


olleH aLL dooG mORNING

*/			
