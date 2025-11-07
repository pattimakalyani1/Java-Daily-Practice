class ArrayPractice
{
	public static void main(String[] args)
	{
		int a[]=new int[]{10,20,30,40};
		int sum=0;
		for(int x=0;x<=a.length-1;x++)
		{
			System.out.print(a[x]+" ");
			sum=sum+a[x];
		}System.out.println();
		System.out.println(sum);
		for(int x=a.length-1;x>=0;x--)
		{
			System.out.print(a[x]+" ");
		}

	}
}

//10 20 30 40
//100
//40 30 20 10


class Arr1
{
	public static void main(String[] args)
	{
		int a[]=new int[]{12,27,30,49};
		int count=0;
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]%2==0)
			{
				System.out.println(a[x]);
				count++;
			}
		}System.out.println("no of even numbers in a array: "+count);
	}
}

/*

12
30
no of even numbers in a array: 2


*/


class Arr2
{
	public static void main(String[] args)
	{
		int a[]=new int[]{12,2,3,49};
		for(int x=0;x<=a.length-1;x++)
		{
			int count=0;
			for(int y=2;y<=a[x]/2;y++)
			{
				if(a[x]%y==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(a[x]);
		}
	}
}


/*

12
30
no of even numbers in a array: 2

*/



class Arr3
{
	public static void main(String[] args)
	{
		int a[]=new int[]{121,141,11,49};
		for(int x=0;x<=a.length-1;x++)
		{
			int number=a[x],temp=number;
			int rev=0;
		
			while(temp!=0)
			{
				rev=rev*10+(temp%10);
				temp/=10;
			}
			if(number==rev)
				System.out.println(rev);
		}
	}
}

/*

121
141
11


*/
	

class Arr4
{
	public static void main(String[] args)
	{
		String a[]=new String[]{"madam","hello","hai","mom"};
		for(int x=0;x<=a.length-1;x++)
		{
			String word=a[x];
			StringBuffer sb=new StringBuffer(word);
			sb.reverse();
			String s3=sb.toString();
			if(s3.equals(word))
				System.out.println(word);
		}
	}
}

/*

madam
mom

*/



class Arr5
{
	public static void main(String[] args)
	{
		int a[]=new int[]{153,370,371,879};
		for(int x=0;x<=a.length-1;x++)
		{
			int count=0,sum=0;
			int number=a[x],temp=a[x],temp1=a[x];
				
			while(number!=0)
			{
				count++;
				number/=10;
			}
			
			while(temp!=0)
			{
				sum=sum+((int)(Math.pow(temp%10,count)));
				temp/=10;
			}
			if(temp1==sum)
				System.out.println(sum);
		}
	}
}

/*

153
370
371

*/


class Arr6
{
	public static void main(String [] args)
	{
		int f=0;
		int s=1;
		int k=6;
		for(int x=0;x<k;x++)
		{
			int t=s+f;
			f=s;
			s=t;
			System.out.println(f);
		}
	}
}

/*

1
1
2
3
5
8

*/

class Arr7
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,3,4,5};
		for(int x=0;x<=a.length-1;x++)
		{
			System.out.print(a[x]+":");
			int f=0,s=1,t;
				for(int y=0;y<a[x];y++)
				{
					t=f+s;
					f=s;
					s=t;
				System.out.print(f+" ");
				}
				System.out.println();
		}
	}
}

/*

10:1 1 2 3 5 8 13 21 34 55
3:1 1 2
4:1 1 2 3
5:1 1 2 3 5

*/


class Arr8
{
	public static void main(String [] args)
	{
		String s="hello all good morning pattima kalyani";
		String s1[]=s.split(" ");
		for(int x=0;x<=s1.length-1;x++)
		{	
			int z=s1[x].length();
			int f=0,s2=1,t;
			System.out.println(s1[x]);
			for(int y=0;y<z;y++)
			{
				t=s2+f;
				f=s2;
				s2=t;
				System.out.print(f+" ");
			}
			System.out.println();
		}
	}
}

/*

hello
1 1 2 3 5
all
1 1 2
good
1 1 2 3
morning
1 1 2 3 5 8 13
pattima
1 1 2 3 5 8 13
kalyani
1 1 2 3 5 8 13

*/

class Arr9
{
	public static void main(String [] args)
	{
		int a[]=new int[]{12,13,15,16};
		int b[]=new int[a.length];
		for(int x=0;x<=a.length-1;x++)
		{
			b[x]=a[x];
		}
		for(int temp:b)
			System.out.print(temp+" ");
	}
}


//12 13 15 16


class Arr10
{
	public static void main(String [] args)
	{
		int a[]=new int[]{12,13,15,16};
		int b[]=new int[a.length];
		int y=b.length-1;
		for(int x=0;x<=a.length-1;x++)
		{
			b[y]=a[x];
			y--;
		}
		for(int temp:b)
			System.out.print(temp+" ");
	}
}

//16 15 13 12

class Arr11
{
	public static void main(String [] args)
	{
		int a[]=new int[]{12,13,15,16};
		int b[]=new int[a.length];
		int mid=a.length/2;
		for(int i=0;i<mid;i++)
		{
			b[i]=a[i];
			System.out.println(b[i]);
			
		}
		int w=mid;
		
		for(int i=a.length-1;i>=mid;i--)
		{
			b[w]=a[i];
			System.out.println(b[w]);
			w--;
		}
		
	}
}

/*
12
13
16
15

*/


class Arr12
{
	public static void main(String [] args)
	{
		int a[]=new int[]{12,13,15,16};
		int b[]=new int[a.length];
		
		int mid=a.length/2;
		int y=0;
		for(int i=mid-1;i>=0;i--)
		{
			b[y]=a[i];
			System.out.println(b[y]);
			y++;
			
		}
		//int mid=a.length/2;
		for(int i=mid;i<=a.length-1;i++)
		{
			b[i]=a[i];
			System.out.println(b[i]);
			
		}
		
	}
}

/*

13
12
15
16

*/

class Arr13
{
	public static void main(String [] args)
	{
		char c[]=new char[]{'C','s','a','F','r','h'};
		for(int x=0;x<=c.length-1;x++)
		{
			if(Character.isUpperCase(c[x]))
			{
				c[x]=Character.toLowerCase(c[x]);
			}
			else if(Character.isLowerCase(c[x]))
			{
				c[x]=Character.toUpperCase(c[x]);
			}
		}
		for(char temp:c)
			System.out.print(temp+" ");
	}
}


//c S A f R H


class Arr14
{
	public static void main(String [] args)
	{
		char c[]=new char[]{'a','e','I','O','d','t'};
		int countv=0,countc=0;
		for(int x=0;x<=c.length-1;x++)
		{
			if(Character.isLetter(c[x]))
			{
			if(c[x]=='e'||c[x]=='i'||c[x]=='o'||c[x]=='u'||c[x]=='a'||c[x]=='E'||c[x]=='I'||c[x]=='O'||c[x]=='U'||c[x]=='A')
			{
				countv++;
			}
			else
			{
				countc++;
			}
			}
		}
		System.out.println("no of vowels: "+countv);
		System.out.println("no of consonants: "+countc);
	}
}
		
/*

no of vowels: 4
no of consonants: 2

*/

class Arr15
{
	public static void main(String [] args)
	{
		char c[]=new char[]{'a','&','I','&','d','&'};
		for(int x=0;x<=c.length-1;x++)
		{
			if(Character.isLetterOrDigit(c[x]))
			{
				System.out.println(c[x]);
			}
			else
				System.out.println("%");
		}
	}
}

/*

a
%
I
%
d
%

*/

class Arr16
{
	public static void main(String [] args)
	{
		char c[]=new char[]{'a','&','I','&','d','&'};
		for(int x=0;x<=c.length-1;x++)
		{
			System.out.print(c[x]);
		}
		System.out.println();
		for(int x=c.length-1;x>=0;x--)
		{
			System.out.print(c[x]);
		}
	}
}

/*

a&I&d&
&d&I&a


*/










	








				
	




			
			
			

				

				

			





