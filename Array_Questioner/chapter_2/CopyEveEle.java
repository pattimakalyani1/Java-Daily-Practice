class CopyEveEle
{
	public static void main(String [] args)
	{
		int a[]=new int[]{11,20,33,40,50};
		int b[]=new int[a.length];
		System.out.println("a array:");
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		int y=0;
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]%2==0)
			{
				b[y]=a[x];
				y++;
			}
		}
		System.out.println("b array:");
		for(int temp:b)
			System.out.print(temp+" ");
	}
}

/*
a array:
11 20 33 40 50
b array:
20 40 50 0 0
*/