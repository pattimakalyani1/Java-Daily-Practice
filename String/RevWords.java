
class RevWords
{
	public static void main(String [] args)
	{
		String s="hello all good morning";
		String [] a=s.split(" ");
		String b="";
		for(int x=0;x<=a.length-1;x++)
		{
			StringBuffer sb=new StringBuffer(a[x]);
			sb.reverse();
			b=b+sb+" ";
		}
		System.out.println(b);
	}
}


/*


olleh lla doog gninrom


*/