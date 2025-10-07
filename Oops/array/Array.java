import java.util.Scanner;
class Array
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter array elements:");
		for(int x=0;x<=a.length-1;x++)
		a[x]=sc.nextInt();
		int sum=0,pro=1;
		for(int x=0;x<=a.length-1;x++)
		{
			sum=sum+a[x];  
			pro=pro*a[x];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		}
		System.out.println("sum of array:"+sum);
		System.out.println("product of array :"+pro);
		System.out.println("reverse array elements:");
		for(int x=a.length-1;x>=0;x--)
		System.out.print(a[x]+" ");
		

	}
}
	
class Array1
{
	public static void main(String [] args)
	{
		String[] s={"hi","hello","all","vgm"};
		System.out.println(s.length);
		System.out.println(s[0]);
		System.out.println(s[0]+" "+s[1]+" "+s[2]);
		char[] c={'d','s','4','t','2'};
		System.out.println(c.length);
		System.out.println(c[0]);
		System.out.println(c[0]+" "+c[1]+" "+c[2]);
		int[] a=new int[5];
		a[0]=12;
		a[3]=18;
		a[7]=99;
		System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]);

	}
}

class Array2
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements:");
		int [] a=new int[5];
		for(int x=0;x<=a.length-1;x++)
		a[x]=sc.nextInt();
		System.out.println("array elements are:");
		for(int x=0;x<=a.length-1;x++)
		System.out.println(a[x]);
	}
}
























