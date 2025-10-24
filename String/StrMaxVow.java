import java.util.Arrays;
class StrMaxVow
{
	public static void main(String[] args)
	{
		String s="madam arora teaches malayalam";
		//System.out.println(s);
		String [] str=s.split(" ");
		int [] b=new int[str.length];
		int count=0,max=0;
		
		for(int x=0;x<=str.length-1;x++)
		{
			int y=0;
			char a[]=str[x].toCharArray();
			count=0;
			for(  y=0;y<=a.length-1;y++)
			{
				if(a[y]=='a'||a[y]=='u'||a[y]=='o'||a[y]=='i'||a[y]=='e'||a[y]=='A'||a[y]=='E'||a[y]=='O'||a[y]=='I'||a[y]=='U')
					count++;
			}
			b[x]=count;
			if(max<count)
			{
				max=count;
			}
		}
		for(int y=0;y<str.length;y++)
		{
			if(b[y]==max)
			{
				System.out.println(str[y]);
			}
		}
	}
}


/*


malayalam


*/