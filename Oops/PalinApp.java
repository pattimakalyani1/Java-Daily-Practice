import java.util.Scanner;
class PalinApp
{
	public static void main(String [] args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		Palin p=new Palin();
		int num=sc.nextInt();
		int result=p.calRev(num);
		p.isPalin(result);
	}
}
class Palin
{
	int rev,temp;
	int calRev(int num)
	{
		temp=num;
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		return rev;
	}
	void isPalin(int result)
	{
		System.out.println(result==temp?"palind":"not palin");
	}
}
		