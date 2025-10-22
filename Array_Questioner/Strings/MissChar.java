import java.util.Arrays;
class MissChar
{
	public static void main(String [] args)
	{
		String s="a quick brown fox jumps over the lazy dog";
		char [] a=s.toCharArray();
		int count=0;
		for(char x='a';x<='z';x++)
		{
			boolean found=false;
			for(int y=0;y<=a.length-1;y++)
			{
				if(x==a[y])
				{
				found=true;
				break;
				}
			
					
			}
			if(found==false)
			{
				count++;
				System.out.println(x);
			}
						
		}
		if(count==0)
			System.out.println("no missing characters");
	}
}


/*

no missing characters

*/