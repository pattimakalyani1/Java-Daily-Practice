class Copy
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,20,30,40,50};
		int b[]=new int[a.length];
		System.out.println("a array:");
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		for(int x=0;x<=a.length-1;x++)
		{
			b[x]=a[x];
		}
		System.out.println("b array:");
		for(int temp:b)
			System.out.print(temp+" ");
	}
}


/*

a array:
10 20 30 40 50
b array:
10 20 30 40 50

*/








