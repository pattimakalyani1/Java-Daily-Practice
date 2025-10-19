class Insertion
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,20,30,40,50,60,70,80,90,100};
		int ele=67;
		int pos=5;
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		for(int x=a.length-1;x>=pos;x--)
		{
			a[x]=a[x-1];
		}
		a[pos-1]=ele;
		System.out.println("after insertion:");
		for(int temp:a)
			System.out.print(temp+" ");
	}	
}


/*

10 20 30 40 50 60 70 80 90 100
after insertion:
10 20 30 40 67 50 60 70 80 90

*/