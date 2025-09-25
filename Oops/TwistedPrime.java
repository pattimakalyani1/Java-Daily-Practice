class TwistedPrime
{
	public static void main(String [] args)
	{
		Prime prime=new Prime();
		Scanner sc=new Scanner();
		System.out.println("enter number");
		int result=prime.calFactor();
		System.out.println(result==0?"Prime":"not prime");
		prime.calRev();
		int rev1=prime.calRev();
		System.out.println(rev1);
		prime.num=rev1;
		int result1=prime.calFactor();
		System.out.println(result1==0?"twisted Prime":"not twisted  prime");
		
	}
}
class Prime
{
	int num;
	int count;
	int rev;
	int  calFactor()
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
	int calRev()
	{
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;
			//System.out.println(num);
			//System.out.println(rev);
		}
		return rev;
	}
}	