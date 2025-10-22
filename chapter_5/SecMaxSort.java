class SecMaxSort
{
	public static void main(String [] args)
	{
		int [] a=new int[]{36,45,67,100,76,89};
		int max=Integer.MIN_VALUE;
		int secmax=max;
		for(int x=0;x<=a.length-1;x++)
		{
			if(max<a[x])
			{
				secmax=max;
				max=a[x];
			}
			else if(max>a[x] && secmax<a[x])
			{
				secmax=a[x];
			}
		}
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		System.out.println("second max element:"+secmax);
	}
}


/*


36 45 67 100 76 89
second max element:89

*/





class SecMinSort
{
	public static void main(String [] args)
	{
		int [] a=new int[]{36,45,67,100,76,89};
		int min=Integer.MAX_VALUE;
		int secmin=min;
		for(int x=0;x<=a.length-1;x++)
		{
			if(min>a[x])
			{
				secmin=min;
				min=a[x];
			}
			else if(min!=a[x] && secmin>a[x])
			{
				secmin=a[x];
			}
		}
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		System.out.println(secmin);
	}
}


/*


36 45 67 100 76 89
45


*/

		