class SwapArr
{
	public static void main(String [] args)
	{
		int [] a= new int[]{1,23,4,5,75,7};
		System.out.println("before:");
		for(int x=0;x<=a.length-1;x++)
		System.out.print(a[x]+" ");
		System.out.println();
		System.out.println("after:");
		System.out.print(a[a.length-1]+" ");
		for(int x=1;x<=a.length-2;x++)
		System.out.print(a[x]+" ");
		System.out.print(a[0]);
	}
}
/*

before:
1 23 4 5 75 7
after:
7 23 4 5 75 1

*/	