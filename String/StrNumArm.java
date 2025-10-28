class StrNumArm
{
	public static void main(String [] args)
	{
		String s="h1b5c3";
		String s1="";
		int num,num1,k=0;
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(Character.isDigit(ch))
			{
				num=Character.getNumericValue(ch);
				s1=s1+num;
			}
		}
		//System.out.println(s1);
		int sum=0;
		char c[]=s1.toCharArray();
		for(int x=0;x<=c.length-1;x++)
		{
			int n=c.length;
			num1=(c[x]-'0');
			sum=sum+(int)Math.pow(num1,n);
			k=k*10+num1;
		}

				
		System.out.println(sum==k?"armstrong":"not armstrong");
		
	}
}




//armstrong