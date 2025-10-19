class Deletion
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,20,30,40,50,60,70,80,90,100};
		int ele=40;
		int index=0;
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		for(int x=0;x<=a.length-1;x++)
		{
			if(ele==a[x])
			{
				index=x;
				break;
			}
		}

		for(int x=index+1;x<=a.length-1;x++)
		{
			a[x-1]=a[x];
		}
		System.out.println("after deletion:");
		for(int temp:a)
			System.out.print(temp+" ");
	}	
}


/*

10 20 30 40 50 60 70 80 90 100
after deletion:
10 20 30 50 60 70 80 90 100 100

*/