import java.util.Scanner;
class ArrMostFreq1
{
	public static void main(String [] args)
	{
		int [] a=new int[]{23,23,45,45,67,78};
		int count1=Integer.MIN_VALUE;
		boolean b[]=new boolean[a.length];
		int[] freq=new int[a.length];
		System.out.println(" most frequency od elemnts:");
		int x,y,count;	
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
			freq[x]=count;
				if(count1<count)
				{
					count1=count;
					
				}
				
		}
		for(x=0;x<=freq.length-1;x++)
		{
			if(count1==freq[x])
			{
				System.out.println(a[x]);
			}
		}
		

	}
}

/*

 most frequency od elemnts:
23
45

*/
