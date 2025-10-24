class RevWordsPalin
{
	public static void main(String [] args)
	{
		String s="madam arora teaches malayalam";
		String [] a=s.split(" ");
		String b="";
		for(int x=0;x<=a.length-1;x++)
		{
			StringBuffer sb=new StringBuffer(a[x]);
			sb.reverse();
			//String c=sb.toString();
			if(sb.equals(a[x]))
				System.out.println(a[x]+" ");
				
		}
		
	}
}


/*

madam
arora
malayalam

*/
