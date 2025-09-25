import java.util.Scanner;
class Eg1
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
		return count;
		
	}
	void isResult()
	{
		int result=eg1.calPrime();
		System.out.println(result==0?"prime":"not prime");
		

	}

	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		Eg1 eg1=new Eg1();

		
		while(true)
		{
			System.out.println("enter number:");
			eg1.num=sc.nextInt();
			eg1.isResult();
			System.out.println("do you want to contiune?(yes/s/no/N):");
			String answer=sc.next();
			if(!answer.equals=("yes"))
				break;
		}
		
	}
}
