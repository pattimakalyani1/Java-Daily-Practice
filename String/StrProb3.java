class StrProb3
{
	public static void main(String [] args)
	{
		String s="Hello All Good Morning";
		String [] a=s.split(" ");
		String s1="";
		for(int x=0;x<=a.length-1;x++)
		{
			//String word=a[x];
			if(x==0)
			{
				//temp=a[x];
				//a[x]=a[a.length-1];
				//a[a.length-1]=temp;
				s1=s1+a[a.length-1];
			}
			else if(x==a.length-1)
			{
				s1=s1+a[0];
			}
			else
			{
				StringBuffer sb=new StringBuffer(a[x]);
				sb.reverse();
				s1=s1+sb;
			}
			s1=s1+" ";
		}
		System.out.println(s1);
	}
}

/*


Morning llA dooG Hello


*/			
				