class ArrVowCon
{
	public static void main(String [] args)
	{
		char c[]=new char[]{'a','A','d','F','e'};
		int countv=0,countc=0;
		for(int x=0;x<=c.length-1;x++)
		{
			char ch=c[x];
			if(ch=='a' || ch=='e' ||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				countv++;
			else
				countc++;
		}
		System.out.println("no of vowels:"+countv);
		System.out.println("no of consonents:"+countc);
	}
}


/*

no of vowels:3
no of consonents:2

*/		