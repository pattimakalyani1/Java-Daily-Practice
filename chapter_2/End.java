class End
{
	public static void main(String [] args)
	{
		int n=8,r=3;
		int start=1,end=n,fact=1;
		int end1=r,end2=(n-r),fact1=1,fact2=1;
		double c=0,d=0;
		for(start=1;start<=end;start++)
		{
			fact*=start;
		
		}
		System.out.println(fact);
		for(start=1;start<=end1;start++)
		{
			fact1*=start;
		}
		System.out.println(fact1);

		for(start=1;start<=end2;start++)
		{
			fact2*=start;
		}
		System.out.println(fact2);

		d=(fact1)*(fact2);
		c=fact/d;
		System.out.println(c);
	}
}