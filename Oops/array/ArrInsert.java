class ArrInsert
{
	public static void main(String [] args)
	{
		int a[]=new int []{10,20,30,40,50,60};
		int insert=70,search=30;
		int x;
		boolean b=false;
		System.out.println("before insertion:");
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		
		for(x=0;x<=a.length-1;x++)
		{
			if(a[x]==search)
			{
				b=true;
				break;
			}
		}
		for(int z=a.length-1;z>x;z--)
		{
			a[z]=a[z-1];
			
		}
		a[x+1]=search;
		a[x]=insert;
		System.out.println("after insertion:");
		for(int temp:a)
			System.out.print(temp+" ");
	}
}
			
/*
			
before insertion:
10 20 30 40 50 60
after insertion:
10 20 70 30 40 50		

*/	



class ArrInsert1
{
	public static void main(String [] args)
	{
		int a[]=new int []{10,20,30,40,50,60};
		int insert=70,search=30;
		int x;
		boolean b=false;
		System.out.println("before insertion:");
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		
		for(x=0;x<a.length-1;x++)
		{
			if(a[x]==search)
			{
				b=true;
				
			
		
		for(int z=a.length-1;z>x;z--)
		{
			a[z]=a[z-1];
			
		}
		}
		}
		a[x+1]=search;
		a[x]=insert;
		System.out.println("after insertion:");
		for(int temp:a)
			System.out.print(temp+" ");
	}
}
	
		
			
		
			