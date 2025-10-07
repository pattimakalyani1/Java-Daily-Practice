import java.util.Scanner;
class Busy
{
	String isBusy(int num)
	{
		return (num%10==7||num/7==0)?"busy number":"not busy number";
	}
	public static void main(String[] args)
	{
		Busy b=new Busy();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		System.out.println(b.isBusy(num));
	}
}
		
		
		