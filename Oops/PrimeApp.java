class PrimeApp
{
	public static void main(String [] args)
	{
		Prime prime=new Prime();
		prime.num=15;
		prime.calFactor();
		prime.checkPrime();
	}
}
class Prime
{
	int num;
	int count;
	void calFactor()
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
	void checkPrime()
	{
		System.out.println(count==0?"Prime":"not prime");
	}
}	