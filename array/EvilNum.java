import java.util.Scanner;
class EvilNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter array elements:");
		for(int x=0;x<=a.length-1;x++)
		a[x]=sc.nextInt();
		int count=0;
		for(int x=0;x<=a.length-1;x++)
		{
			int num=a[x],sum=0;
			int n=num*num;
			while(n!=0)
			{
				sum=sum+(n%10);
				n/=10;
			}
			if(sum==num)
			{
				System.out.println(a[x]+" is Evil number");
				count++;
			}
		}System.out.println("no of evil number:"+count);
	}
}


/*

Enter array elements:
9
6
5
4
4
9 is Evil number
no of evil number:1
*/

class Power
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("enter array elements:");
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
		int count=0;
		for(int x=0;x<=a.length-1;x++)
		{
			int num=a[x];
			int  temp=num,sum=0,pro=1;
			while(num!=0)
			{
				sum=sum+num%10;
				pro=pro*num%10;
				num/=10;
			}
			if(sum==pro)
			{
				System.out.println(a[x]+" is power number");
				count++;
			}
		}System.out.println("no of power numbers in a array:"+count);
	}
}


/*

enter array elements:
123
321
11
22
2
123power number
321power number
22power number
2power number
no of power numbers in a array:4
*/	

class Auto
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("enter array elements:");
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
		int count1=0;
		for(int x=0;x<=a.length-1;x++)
		{
			int num=a[x],count=0;
			int temp=num;
			while(num!=0)
			{
				count++;
				num/=10;
			}
			int n=(temp*temp)%(int)Math.pow(10,count);
			if(n==temp)
			{
				count1++;
				System.out.println(a[x]+" is Automatic number");
			}
		}
		System.out.println("no of automatic numbers:"+count1);	
	}
}

/*

enter array elements:
76
6
5
4
3
76 is Automatic number
6 is Automatic number
5 is Automatic number
no of automatic numbers:3

*/


class Tech
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("enter array elements:");
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
		for(int x=0;x<=a.length-1;x++)
		{
			int num=a[x],count=0,temp=num,copy=num;
			while(num!=0)
			{
				count++;
				num/=10;
			}
			int n1=temp%(int)Math.pow(10,count/2);
			int n2=temp/(int)Math.pow(10,count/2);
			int sum=n1+n2;
			if(copy==sum*sum)
			{
				System.out.println(a[x]+"Technology number");
			}
			
		}
	}
}


/*

enter array elements:
2025
3035
3043
9801
9803
2025Technology number
9801Technology number
*/	



class Busy
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("enter array elemesnts:");
		for(int x=0;x<=a.length-1;x++)
		a[x]=sc.nextInt();
		int count=0;
		for(int x=0;x<=a.length-1;x++)
		{
			int num=a[x];
			if(num%10==7||num%7==0)
			{
				count++;
				System.out.println(a[x]+" is busy number");
			}
		}
		System.out.println("no of busy number:"+count);
	}
}
		
/*

enter array elemesnts:
4556
432
67
7
677
67 is busy number
7 is busy number
677 is busy number
no of busy number:3

*/


class Inav
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("enter array elemesnts:");
		for(int x=0;x<=a.length-1;x++)
		a[x]=sc.nextInt();
		int count=0;
		for(int x=0;x<=a.length-1;x++)
		{
			int num=a[x];
			while(num>=10)
			{
				int sum=0;
				while(num!=0)
				{
					sum=sum+(num%10);
					num/=10;
				}
				num=sum;
								
			}
			if(num==1)
			{
				System.out.println(a[x]+"is inav number");
			}
		}
	}
}




















