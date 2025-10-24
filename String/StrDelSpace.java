import java.util.Arrays;
class StrDelSpace
{
	public static void main(String [] args)
	{
		String s=" Hel lo al l ";
		String s1="";
		String [] s2=s.split(" ");
		System.out.println("using split method removing spaces:");
		for(String temp:s2)
		{
			s1=s1+temp;
		}
		System.out.println(s1);
		String s3="";
		char s4[]=s.toCharArray();
		System.out.println("using toCharArray method removing spaces:");
		for(char temp1:s4)
		{
			if(temp1>='a' && temp1<='z' ||temp1>='A' && temp1<='Z')
			{
				s3=s3+temp1;
			}
		}
		System.out.println(s3);
		
	}
}
		
/*


using split method removing spaces:
Helloall
using toCharArray method removing spaces:
Helloall


*/	
