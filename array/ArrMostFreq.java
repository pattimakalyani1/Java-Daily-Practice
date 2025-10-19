import java.util.Scanner;
class ArrMostFreq
{
	public static void main(String [] args)
	{
		int [] a=new int[]{23,23,23,56,78,76,98};
		int count1=Integer.MIN_VALUE;
		boolean b[]=new boolean[a.length];
		int Most_rep=0;
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
				if(count1<count)
				{
					count1=count;
					Most_rep=a[x];

				}
				
		}
		System.out.println(Most_rep);
		

	}
}

/*

 most frequency od elemnts:
23

*/
