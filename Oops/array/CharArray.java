class Char
{
	public static void main(String [] args)
	{
		char a[]=new char[]{'x','^','9','Y','T','@'};
		int countA=0,counta=0,count1=0,countSy=0,countSp=0;
		for(int x=0;x<=a.length-1;x++)
		{
			
			char c=a[x];
			if(c>='A' && c<='Z')
			{
			countA++;
			}
			else if(c>='a' && c<='z')
			{
			counta++;
			}
			else if(c>='0' && c<='9')
			{
			count1++;
			}
			else if(c==' ')
			{
			countSp++;
			}
			else
			{
			countSy++;
			}
		}
		System.out.println("upper "+countA);
		System.out.println("lower "+counta);
		System.out.println("numbers "+count1);
		System.out.println("space "+countSp);
		System.out.println("symbols "+countSy);
	}
}

	
/*
upper 2
lower 1
numbers 1
space 0
symbols 2
*/	