class Swap2
{
	public static void main(String[] args)
	{
		int n1=12,n2=24;
		System.out.println("before swapping");
		System.out.println("n1:"+n1);
		System.out.println("n2:"+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("after swapping");
		System.out.println("n1: "+n1);
		System.out.println("n2:"+n2);
	}
}
