class Fac
{
	public static void main(String [] args)
	{
		long n=426984l,count=0,n1,n2,sum=0,temp=n;
		while(n!=0)
		{
			n/=10;
			count++;
		}
		//System.out.println(count);
		long h=count/2;
		//System.out.println(h);
		long c=((long)(Math.pow(10,h)));
		//System.out.println(c);33

		n=temp;
		n1=n%c;
		System.out.println(n1);
		n2=n/c;
		System.out.println(n2);
		sum=n1+n2;
		System.out.println(sum);
		long rem=0;
		while(sum!=0)
		{
			rem=sum%10;
			//System.out.println(rem);
			System.out.print(rem+":");
			for(int i=1;i<=rem;i++)
			{
				
				if(rem%i==0)
				{
					System.out.print(i+" ");
				}
				
			}
			System.out.println();
			sum/=10;
		}
	}
}
			
