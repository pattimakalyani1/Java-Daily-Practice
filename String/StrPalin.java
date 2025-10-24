import java.util.Arrays;
class StrPalin
{
	public static void main(String [] args)
	{
		String s="a man , a plan 1 & a canal , panama";
		String s1="";
		String s4="";
		char s3[]=s.toCharArray();
		for(int x=0;x<=s3.length-1;x++)
		{
			if(s3[x]>='a' && s3[x]<='z')
			{
				s1=s1+s3[x];
			}
		}
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		s4=sb.toString();
		System.out.println(s4.equals(s1)?"palin":"not palin");

		
	}
}


