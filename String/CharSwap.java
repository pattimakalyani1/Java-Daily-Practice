import java.util.Arrays;
class CharSwap
{
	public static void main(String[] args)
	{
		String s=new String("hElLo");
		System.out.println(s);
		char[] a=s.toCharArray();
		String copy="";
		copy=copy+a[a.length-1];
		for(int x=1;x<=a.length-2;x++)
		{
			copy=copy+a[x];
		}
		copy=copy+a[0];
		System.out.println(copy);
	}
}
		
		
/*

hElLo
oElLh

*/