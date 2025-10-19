import java.util.Arrays;
class CharSearch
{
	public static void main(String[] args)
	{
		String s=new String("hElLo AlL");
		char Search='l';
		boolean b=false;
		System.out.println(s);
		char[] a=s.toCharArray();
		int x;
		for(x=0;x<=a.length-1;x++)
		{
			if(a[x]==(Search))
			{
				b=true;
				break;
			}
		}
		System.out.println(b?"found "+(x+1)+" position":"not found");
	}
}


/*

hElLo AlL
found 3 position

*/