import java.util.Arrays;
class CharFreq
{
	public static void main(String[] args)
	{
		String s=new String("hElLo AlL");
		System.out.println(s);
		char[] a=s.toCharArray();
		int count=1;
		boolean[] b=new boolean[a.length];
		for(int x=0;x<=a.length-1;x++)
		{
			if(b[x]==true)
				continue;
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==a[y])
				{
					b[x]=true;
					count++;
				}
			}
			System.out.println(a[x]+" is "+count);
		}
	}
}
		

/*

hElLo AlL
h is 1
E is 1
l is 2
L is 3
o is 3
  is 3
A is 3
l is 3
L is 3

*/