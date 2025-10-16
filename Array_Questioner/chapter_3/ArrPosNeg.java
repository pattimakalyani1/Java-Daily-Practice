import java.util.Scanner;
class ArrPosNeg
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
		int countP=0,countN=0,countE=0,countO=0;
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]>0)
				countP++;
			else
				countN++;
		}
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]%2==0)
				countE++;
			else
				countO++;
		}

		System.out.println("no of positive elements in a array: "+countP);
		System.out.println("no of negative elements in a array: "+countN);
		System.out.println("no of even elements in a array: "+countE);
		System.out.println("no of odd elements in a array: "+countO);

	}
}


/*

89
-76
56
-87
-8
-5
45
34
65
76
no of positive elements in a array: 6
no of negative elements in a array: 4
no of even elements in a array: 5
no of odd elements in a array: 5

*/