import java.util.Arrays;
class Strsort
{
	public static void main(String [] args)
	{
		String s="Hello all";
		char [] c=s.toCharArray();
		String s1="",s2="";
		Arrays.sort(c);
		for(char temp:c)//ascending 
		{
			s1=s1+temp;
		}
		System.out.println(s1);
		for(int x=c.length-1;x>=0;x--)//descending
		{
			s2=s2+c[x];
		}
		System.out.println(s2);
		
			
	}
}


/*


 Haellllo
olllleaH


*/