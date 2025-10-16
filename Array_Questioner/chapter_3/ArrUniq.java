import java.util.Scanner;
class ArrUniq
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
		System.out.println("unique elements:");
		int x,y,count;	
		for(x=0;x<=a.length-1;x++)
		{
			if(b[x]==true)
				continue;
			count=0;
			for(y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=true;
					break;
				}
			}
			if(count==0)
				System.out.print(a[x]+" ");
		}
	}
}


/*

enter array elements:
23
45
65
43
23
unique elements:
45 65 43
*/