class LeftRotb
{
	public static void main(String [] args)
	{
		int [] a=new int []{10,20,30,40};
		int []b=new int[a.length];
		int r=5;
		int n=a.length;
		r=r%n;
		for(int temp:a)
			System.out.print(temp+" ");

			for(int x=0;x<n;x++)
			{
				b[x]=a[(x+r)%n];
				
			}
		System.out.println();
		for(int temp:b)
			System.out.print(temp+" ");
	}
}


/*

10 20 30 40
20 30 40 10

*/