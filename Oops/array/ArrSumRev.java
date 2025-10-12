class ArrSumRev
{
	public static void main(String [] args)
	{
		Sample sample= new Sample();
		int[] a= new int[]{10,20,30,40,50,89};
		System.out.println("sum:"+sample.sum(a));
		int[] d=sample.rev(a);
		System.out.println("reverse:");
		for(int temp1:d)
		System.out.print(temp1+" ");

		
	}
	
}
class Sample
{
	int[]  rev(int [] b)
	{
		int[]c=new int[b.length];
		for(int x=b.length-1,y=0;x>=0;x--,y++)
		{
			c[y]=b[x];
		}
		return c;
	}
	int sum(int [] b)
	{
		int sum=0;
		for(int temp:b)
		{
			if(temp%2==0)
			sum+=temp;
		}
		return sum;
	}
}	


