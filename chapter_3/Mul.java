class Mul
{
	public static void main(String [] args)
	{ 
		int n=7,x=0;
		for(int i=1;i<=10;i++)
		{
			/*if(i%3==0)
			{
				System.out.println(n+"X"+i+"="+n*i);
			}*/
			x=n*i;
			if(x%3==0)
			{
				System.out.println(n+"x"+i+"="+n*i);
			}
		}
	}
}
