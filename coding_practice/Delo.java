import java.util.Scanner;
class Delo
{	
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,p,count=0;
		int min=Integer.MAX_VALUE;
		System.out.println("enter n value:");
		int n=sc.nextInt();
		System.out.println("enter array values:");
		for(int x=0;x<n;x++)
		{
			
			p=sc.nextInt();//4//3//7//2//6//1
			if(p<min)//4<min//3<4 T//7<3 f//2<3 T//6<2 F//1<2
			{
				min=p;//min=4//min=3//min=2//min=1
				count++;//1//2//3//4
			}
		}
		System.out.println("count:"+(count-1));
	
	}
}

/*
enter n value:
6
enter array values:
4
3
7
2
6
1 
count:3

*/


class Delo1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String binary="";
		while(n>0)
		{
			int rem=n%2;
			binary=rem+binary;
			n/=2;
		}
		System.out.println(binary);
	}
}



class Delo2
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int k=sc.nextInt();
		int ones=0;
		for(int x=1;x<n;x++)
		{
			//System.out.println(x);
			int temp=x;
			String binary="";
			while(temp>0)
			{
				int rem=temp%2;
				binary=rem+binary;
				temp=temp/2;
			}
			//System.out.println(binary);
			int count=0;
			for(int i=0;i<binary.length();i++)
			{
				char c=binary.charAt(i);
				if(c=='1')
					count++;
			}
			
			if(count==k)
			{
				ones++;
			}
				
			
		}
		System.out.println(ones);
	}
}


/*

7
3
ouput:1

*/


