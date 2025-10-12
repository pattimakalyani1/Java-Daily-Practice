class DelEle
{
	public static void main(String [] args)
	{
		int [] a= new int[]{10,20,30,40,50,89};
		int del=40,x;
		Boolean b=false;
		System.out.println("before deletion:");
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		for(x=0;x<=a.length-1;x++)
		{
			if(a[x]==del)
			{
				b=true;
				break;
			}
		}
		System.out.println(x+1);
		for(int z=x;z<a.length-1;z++)
			a[z]=a[z+1];
		
		System.out.println("after deletion:");
		for(int temp:a)
			System.out.print(temp+" ");
	}
}


/*

before deletion:
10 20 30 40 50
3
after deletion:
10 20 40 50 50


*/

//using methods

class DelEle1
{
	public static void main(String [] args)
	{
		int [] a= new int[]{10,20,30,40,50,89};
		int del=40;
		System.out.println("before deletion:");
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		DelEle1 de=new DelEle1();
		int[] d=de.searchPresent(a,del);
		System.out.println("after deletion:");
		for(int temp:d)
			System.out.print(temp+" ");
	
		
		
	}
	int[] searchPresent(int [] b,int del)
	{
		boolean found=false;
		int x,z;
		for(x=0;x<=b.length-1;x++)
		{
			if(b[x]==del)
			{
				found=true;
				break;
			}
		}
		
		for( z=x;z<b.length-1;z++)
			b[z]=b[z+1];
	
		return b;
	}
}

/*

before deletion:
10 20 30 40 50 89
after deletion:
10 20 30 50 89 89

*/				



// to deleted elemesnt has duplicates:


class DelEle2
{
	public static void main(String [] args)
	{
		int [] a= new int[]{50,20,30,50,40,50,89};
		int del=50,x;
		Boolean b=false;
		System.out.println("before deletion:");
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();
		for(x=0;x<=a.length-1;x++)
		{
			if(a[x]==del)
			{
				b=true;
				//System.out.println(x+1);
				for(int z=x;z<a.length-1;z++)
				a[z]=a[z+1];
			}
		}
		
		System.out.println("after deletion:");
		for(int temp:a)
			System.out.print(temp+" ");
	}
}

/*

before deletion:
50 20 30 50 40 50 89
after deletion:
20 30 40 89 89 89 89

*/

class DelEle3
{
	public static void main(String [] args)
	{
		int [] a= new int[]{50,20,30,50,40,50,89};
		int del=50,x;
		System.out.println("before deletion:");
		for(int temp:a)
			System.out.print(temp+" ");
		System.out.println();	
		DelEle3 de=new DelEle3();
		int c[]=de.isDel(a,del);
		System.out.println("after deletion:");
		for(int temp:c)
			System.out.print(temp+" ");
	}
	int [] isDel(int [] a,int del)
	{
		Boolean b=false;
		int x;
		for(x=0;x<=a.length-1;x++)
		{
			if(a[x]==del)
			{
				b=true;
				//System.out.println(x+1);
				for(int z=x;z<a.length-1;z++)
				a[z]=a[z+1];
			}
		}
		return a;
	}

}

/*

before deletion:
50 20 30 50 40 50 89
after deletion:
20 30 40 89 89 89 89

*/


			
		
		