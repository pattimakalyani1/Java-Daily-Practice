class PrimeApp1
{
	public static void main(String [] args)
	{
		Prime prime=new Prime();
		int result=prime.calFactor(11);
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