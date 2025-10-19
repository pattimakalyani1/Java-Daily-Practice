import java.util.Arrays;
class Sorth
{
	public static void main(String [] args)
	{
		String s[]=new String[]{"hello","all","good","morning","have","a","nice","day"};
		String s1[]=new String [(s.length)/2];
		for(String temp:s)
			System.out.print(temp+" ");
		System.out.println();
		for(int x=0,y=0;x<=s.length-1;x++)
		{
			if(x%2==0)
			{
				s1[y]=s[x];
				y++;
			}
		}
		System.out.println("after sorting: even idices");
		Arrays.sort(s1);
		for(String temp:s1)
			System.out.print(temp+" ");

		
	}
}

/*

hello all good morning have a nice day
after sorting: even idices
good have hello nice

*/




class Sorth1
{
	public static void main(String [] args)
	{
		String s[]=new String[]{"hello","all","good","morning","have","a","nice","day"};
		String s1[]=new String [(s.length)/2];
		for(String temp:s)
			System.out.print(temp+" ");
		System.out.println();
		for(int x=0,y=0;x<=s.length-1;x++)
		{
			if(x%2==0)
			{
				s1[y]=s[x];
				y++;
			}
		}
		System.out.println("after sorting:");
		String temp;
		for(int x=0;x<s1.length-1;x++)
		{
			for(int y=x+1;y<s1.length;y++)
			{
				if(s1[x].compareTo(s1[y])>0)
				{
					temp=s1[y];
					s1[y]=s1[x];
					s1[x]=temp;
				}
			}
		}
		for(String temp1:s1)
			System.out.print(temp1+" ");

		
	}
}

/*

hello all good morning have a nice day
after sorting:
good have hello nice

*/