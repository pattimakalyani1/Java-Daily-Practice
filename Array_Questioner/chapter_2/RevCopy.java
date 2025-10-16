class RevCopy
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,20,30,40,50};
		int b[]=new int[a.length];
		System.out.println("a array:");
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		for(int x=a.length-1,y=0;x>=0;x--,y++)
		{
			b[y]=a[x];
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
50 40 30 20 10

*/
