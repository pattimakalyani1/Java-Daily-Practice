import java.util.Scanner;
class ArrMostFreq1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int [] a=new int[8];
		int count1=Integer.MIN_VALUE;
		boolean b[]=new boolean[a.length];
		int[] freq=new int[a.length];
		int Most_rep=0;
		System.out.println("enter array elements:");
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
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

enter array elements:
23
23
45
45
56
76
87
98
 most frequency od elemnts:
23
45

*/
