import java.util.Arrays;
class CharSort
{
	public static void main(String[] args)
	{
		String s=new String("hElLo all");
		System.out.println(s);
		String copy="";
		char[] a=s.toCharArray();
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]>a[y])
				{
					char temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
		for(char temp1:a)
		{
			copy=copy+temp1;
		}
		System.out.println(copy);
	}
}
	

/*

hElLo all
 ELahlllo
*/				