class Rightb
{
	public static void main(String [] args)
	{
		int [] a=new int []{10,20,30,40};
		for(int temp:a)
			System.out.print(temp+" ");
	}
	
			int copy=a[a.length-1];
			for(int x=a.length-1;x>0;x--)
			{
				a[x]=a[x-1];
				
			}
			a[0]=copy;
		}
		System.out.println();
		for(int temp:a)
			System.out.print(temp+" ");
	}
}
