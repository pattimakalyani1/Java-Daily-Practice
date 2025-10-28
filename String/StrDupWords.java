class StrDupWords
{
	public static void main(String [] args)
	{
		String s="hello all good morning good";
		String s1[]=s.split(" ");
		boolean b[]=new boolean[s1.length];
		int count,x;
		for(x=0;x<s1.length-1;x++)
		{
			if(b[x]==true)
				continue;
			count=0;
			for(int y=x+1;y<=s1.length-1;y++)
			{
				if(s1[x].equals(s1[y]))
				{
					count++;
					b[y]=true;
				}
			}
		
		if(count==0)

			System.out.println(s1[x]);
		}
	}
}
				
/*

hello
all
morning

*/


class StrDupWords1
{
	public static void main(String [] args)
	{
		String s="hello all good morning good";
		String s1[]=s.split(" ");
		String s2="";
		for(int x=0;x<=s1.length-1;x++)
		{
			if(s.indexOf(s1[x])==s.lastIndexOf(s1[x]))
			{
				if(s2.indexOf(s1[x])==-1)
					s2=s2+s1[x]+" ";
			}
		}
		System.out.println(s2);
	}
}


//hello all morning	








class StrDupWords2
{
	public static void main(String [] args)
	{
		String s="hello all good morning good";
		String s1[]=s.split(" ");
		boolean b[]=new boolean[s1.length];
		int count,x,count1=0;
		for(x=0;x<s1.length-1;x++)
		{
			if(b[x]==true)
				continue;
			count=0;
			for(int y=x+1;y<=s1.length-1;y++)
			{
				if(s1[x].equals(s1[y]))
				{
					count++;
					b[y]=true;
				}
			}
		
		if(count==0)
		{
			count1++;
			System.out.println(s1[x]);
		}
		}System.out.println("no of unique words:"+count1);
	}
}
	
/*

hello
all
morning
no of unique words:3


*/	



class StrDupWords3
{
	public static void main(String [] args)
	{
		String s="hello all good morning good";
		String s1[]=s.split(" ");
		boolean b[]=new boolean[s1.length];
		int count,x,count1=0;
		for(x=0;x<s1.length-1;x++)
		{
			if(b[x]==true)
				continue;
			count=0;
			for(int y=x+1;y<=s1.length-1;y++)
			{
				if(s1[x].equals(s1[y]))
				{
					count++;
					b[y]=true;
				}
			}
		
		if(count>0)
		{
			count1++;
			System.out.println(s1[x]);
		}
		}System.out.println("no of repeated words:"+count1);
	}
}

/*
good
no of repeated words:1
*/
	
