import java.util.*;
class A
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
				
		System.out.println("result");					
		for(int x=0;x<=a.length-1;x++)
		{
			boolean b2=false;
			for(int y=x+1;y<a.length-1;y++)
			{

				if(a[x]<a[y])
				{
					b2=true;
					break;
				}
				
			}
			if(b2==false)
				System.out.print(a[x]+" ");
		}
	}
}
					