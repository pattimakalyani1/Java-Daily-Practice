import java.util.Scanner;
class PrimeApp1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		Prime prime=new Prime();
		int result=prime.calFactor(sc.nextInt());
		prime.checkPrime(result);
	}
}
class Prime
{
	int count;
	int calFactor(int num)
	{
		for(int x=2;x<=num/2;x++)
		{
			if(num%x==0)
			{
				count++;
				break;
			}
		}
		return count;
	}
	void checkPrime(int result)
	{
		System.out.println(count==0?"Prime":"not prime");
	}
}	