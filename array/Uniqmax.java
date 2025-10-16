import java.util.Arrays;
class UniqMax
{
	public static void main(String [] args)
	{
		int[] a=new int[]{10,80,20,20,20};
		boolean [] b=new boolean[a.length];
		int max=Integer.MIN_VALUE;
		int x,y,count,count1=0;
		for(x=0;x<=a.length-1;x++)
		{
			
			if(b[x]==true)
				continue;
			count=0;
			for(y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==a[y])
				{
					
					
					count++;
					b[y]=true;
					
				}
			}
			if(count==0)
			{
				if(max<a[x])
					max=a[x];
				
			}
			
		}
		System.out.println(max);
		
		
	}
}


/*

80

*/	