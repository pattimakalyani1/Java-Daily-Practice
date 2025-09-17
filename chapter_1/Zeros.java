class Zeros
{
	public static void main(String [] args)
	{
		int n=6200,count=0,rem=0,count1=0,dif,rev=0,rem2=0,rev1=0;
		while(n!=0)
		{
			count++;
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println(rev);		
		while(rev!=0)
		{
			count1++;
			rem2=rev%10;
			rev1=rev1*10+rem2;
			rev/=10;
		}
		System.out.println(rev1);
		dif=count-count1;
		rev1=rev1*(int)(Math.pow(10,dif));
		/*while(dif!=1)
		{
			rev1=rev1*(int)(Math.pow(10,dif));
			dif--;
		}*/
		System.out.println(rev1);
	}
}
				

