class Half
{
	public static void main(String [] args)
	{
	long n =494567897879l,n1,n2;
	long org_n=n;
        int count=0,power;
	while(n!=0)
	{	
		n=n/10;
		count++;
	}
	power=count/2;
	System.out.println(power);
	n1=(long) (org_n/(Math.pow(10,power)));
	n2=(long)(org_n%(Math.pow(10,power)));
	System.out.println(n1);
	System.out.println(n2);
	}
}