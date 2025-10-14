class Frequency
{
	public static void main(String [] args)
	{
		int [] a=new int[]{10,20,30,20,30,40,50,50};
		boolean [] b=new boolean [a.length];
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
			System.out.println(a[x]+ " is "+count+" times");
		}
	}
}
				

/*

10 is 1 times
20 is 2 times
30 is 2 times
40 is 1 times
50 is 2 times

*/


		
		












					