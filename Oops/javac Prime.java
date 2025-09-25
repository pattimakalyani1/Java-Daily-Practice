import java.util.Scanner;
class Eg1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner();
		System.out.println("enter number:");
		sc.num=nextInt();
		System.out.println(sc.calPrime());
		
	}
}
class Prime
{
	int num,count;
	int calPrime()
	{
		for(int x=2;x<=num/2;x++)
		{
			if(num%x==0)
			{
				count++;
				break;
			}
		}
	}
}
	