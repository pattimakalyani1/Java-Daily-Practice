import java.util.Arrays;
class CharFirUnq
{
	public static void main(String[] args)
	{
		String s=new String("hhElLo AlL");
		System.out.println(s);
		char[] a=s.toCharArray();
		int count=0;
		String copy="";
		boolean[] b=new boolean[a.length];
		for(int x=0;x<=a.length-1;x++)
		{	count=0;
			if(b[x]==true)
				continue;
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==a[y])
				{
					b[y]=true;
					count++;
				}
			}
			if(count==0)
			{
				copy=copy+a[x];
				break;
			}
		}
		System.out.println(copy);
	}
}


/*

hhElLo AlL
E

*/
