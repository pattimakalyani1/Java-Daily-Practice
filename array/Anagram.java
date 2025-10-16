import java.util.Arrays;
class Anagram
{
	public static void main(String [] args)
	{
		int[] a=new int[]{10,80,20,20,20};
		int [] b=new int[]{10,20,80,20,50};.
		boolean c[]=new boolean[a.length];
		if(a.length==b.length)
		{
			int x,y,count=0;
			Arrays.sort(a);
			Arrays.sort(b);
			for(x=0;x<=a.length-1;x++)
			{					
					if(a[x]==b[x])
					{
						
						count++;
		
					}
				
			}
			if(count==a.length)
				System.out.println("anagram");
			else
				System.out.println("not anagram");

		}
		else
			System.out.println("not anagram");
	}
}

/*

not anagram

*/