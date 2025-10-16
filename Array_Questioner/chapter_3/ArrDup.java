import java.util.Scanner;
class ArrDup
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int [] a=new int[5];
		boolean b[]=new boolean[a.length];
		System.out.println("enter array elements:");
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("duplicate elements:");
		int x,y,count;	
		for(x=0;x<=a.length-1;x++)
		{
			if(b[x]==true)
				continue;
			count=1;
			for(y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=true;
					
				}
			}
			if(count>1)
				System.out.print(a[x]+" ");
		}
	}
}


/*

enter array elements:
23
23
54
54
34
duplicate elements:
23 54

*/