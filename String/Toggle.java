import java.util.Arrays;
class Toggle
{
	public static void main(String[] args)
	{
		String s=new String("hElLo AlL");
		System.out.println(s);
		char[] a=s.toCharArray();
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]>='A' && a[x]<='Z')
				a[x]=(char)(a[x]+32);
			else if(a[x]==' ');
			else
				a[x]=(char)(a[x]-32);
		}
		for(int x=0;x<=a.length-1;x++)
		{
			System.out.print(a[x]);
		}
	}
}


/*

hElLo AlL
HeLlO aLl

*/