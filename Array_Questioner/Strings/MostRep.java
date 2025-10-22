import java.util.Arrays;
class MostRep
{
	public static void main(String [] args)
	{
		String s="hello all good morning";
		
		char [] a=s.toCharArray();
		boolean b[]=new boolean[a.length];
		int count1=Integer.MIN_VALUE;
		int x,y,count;
		int most_req[]=new int[a.length];
		
			for(x=0;x<=a.length-1;x++)
			{
				if(b[x]==true)
					continue;
				count=1;
				for(y=x+1;y<=a.length-1;y++)
				{
					if(a[x]==a[y])
					{
						b[y]=true;
						count++;
					}
				}
				most_req[x]=count;
				if(count1<count)
				{
					count1=count;
				}
			}
		
		for(int i=0;i<=most_req.length-1;i++)
		{
			if(most_req[i]==count1)
			{
				System.out.println(a[i]);
			}
		}
	}
}
	

/*

l
o

*/		

			
				
