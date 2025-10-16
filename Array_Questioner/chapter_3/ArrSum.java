import java.util.Scanner;
class ArrSum
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int [] a=new int[10];
		System.out.println("enter array elements:");
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
		int sum=0;
		for(int x=0;x<=a.length-1;x++)
		{
			sum=sum+a[x];
		}
		System.out.println("sum of elements in a array: "+sum);
	}
}

/*

enter array elements:
23
34
43
45
65
65
76
3
4
5
sum of elements in a array: 363


*/