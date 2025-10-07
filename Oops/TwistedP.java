import java.util.Scanner;
class TwistedP
{
	public static void main(String [] args)
	{
		Twist t=new Twist();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int x=sc.nextInt();
		int result=t.factors(x);
		String result1=t.isPrime(result);
		System.out.println(result1);
		t.rev= t.calRev(x,result1);
		int count=t.factors(t.rev);
		System.out.println(count==0?"Twited prime":"not twisted prime");
		
		
		
	}
}
class Twist
{
	int rev,factor;
	String output;
	int factors(int num)
	{
		for(int x=2;x<=num/2;x++)
		{
			if(num%x==0)
			{
				factor++;
				break;
			}
		}return factor;
	}
	String isPrime(int result)
	{
		output=result==0?"prime":"not prime";
		return output;
	}
	int calRev(int num,String output)
	{
		//System.out.println(num);
		if(output=="prime")
		{
			
			while(num!=0)
			{
				 rev=rev*10+(num%10);
				num/=10;
			}
			
		}
	
		
		return rev;

	}
	
}
	
	
	
	