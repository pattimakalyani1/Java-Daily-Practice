import java.util.Scanner;
class ArrFreq
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int [] a=new int[8];
		boolean b[]=new boolean[a.length];
		System.out.println("enter array elements:");
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("frequency od elemnts:");
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
					
					b[y]=true;
					count++;
					
				}
			}
				System.out.println(a[x]+" :"+count);
		}
	}
}


/*

enter array elements:
23
453
34
54
23
43
54
54
frequency od elemnts:
23 :2
453 :1
34 :1
54 :3
43 :1

*/