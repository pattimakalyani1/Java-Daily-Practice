import java.util.*;
class Tcs {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int a[]=new int[N];
       for(int x=0;x<=a.length-1;x++)
       {
           a[x]=sc.nextInt();
       }
       int count=0;
       int b[]=new int[N];
       int y=0;
     for(int x=0;x<=N-1;x++)
     {
         
         if(a[x]==0)
         {
             count++;
         }
         else
         {
             b[y]=a[x];
             y++;
         }
         
     }
     for(int x=y;x<=N-1;x++)
     {
         b[x]=0;
     }
     for(int temp:b)
     System.out.println(temp);
       
    }
}





class Tcs1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String binary="";
		String res="";
		
		while(N!=0)
		{
			binary=(N%2)+binary;
			N=N/2;
		}
		System.out.println(binary);
		char c[]=binary.toCharArray();

		for(int x=0;x<=c.length-1;x++)
		{
			res+=(c[x]=='0')?'1':'0';
		}

		System.out.println(res);
		
		
	}
}




class Tcs2
{
    public static void main(String[] args)
	 {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int res=1;
       a=a-6;
       if(a!=0)
       {
           res=res+(a/7);
           
       }
       System.out.println(res);
    }
}
	



class Tcs3 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int x=0;x<=a.length-1;x++)
       {
           a[x]=sc.nextInt();
       }
       for(int x=0;x<a.length-1;x++)
       {
           int min=x;
           for(int y=x+1;y<=a.length-1;y++)
           {
               if(a[min]>a[y])
                min=y;
           }
           int temp=a[min];
           a[min]=a[x];
           a[x]=temp;
       }
       System.out.println("array");
       for(int temp1:a)
       System.out.println(temp1);
     
    }
}





class Tcs4{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int x=0;x<=a.length-1;x++)
       {
           a[x]=sc.nextInt();
       }
	int count0=0,count1=0,count2=0;
	for(int temp:a)
	{
		if(temp==0)
			count0++;
		else if(temp==1)
			count1++;
		else
			count2++;
	}
	
	int b[]=new int[n];
	int c=0;
	int p=count1;
	for(int x=0;x<=a.length-1;x++)
	{
		if(x<count0)
		{
			b[x]=0;
			c++;
			
		}
		else if(c==count0 && p>0)
		{
			b[x]=1;
			p--;
				
		}
		else
		{
			b[x]=2;
		}
	}
	for(int temp1:b)
		System.out.println(temp1);
	}
}





class Tcs5{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int x=0;x<=a.length-1;x++)
       {
           a[x]=sc.nextInt();
       }
	int max=Integer.MIN_VALUE,count=0;
	for(int x=0;x<=a.length-1;x++)
	{
		if(max<a[x])
		{
			max=a[x];
			count++;
		}
	}
	System.out.println(count);
	}
}





	
class Tcs6
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int prod=1;
		while(n!=0)
		{
			int rem=n%10;
			prod*=rem;
			n/=10;
		}
		System.out.println(prod);
	}
}



class Tcs7 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int [] a=new int[n];
       int []b=new int[n];
       for(int x=0;x<=n-1;x++)
       {
           a[x]=sc.nextInt();
       }
           for(int x=0;x<=n-1;x++)
       {
           b[x]=sc.nextInt();
       }
       int res=0,max=0;
       for(int x=0;x<=a.length-1;x++)
       {
           res=res+a[x]-b[x];
           if(max<res)
           max=res;
        //   System.out.println(res);
       }
       System.out.println(max);
       
    }
}

/* output:
5
7 0 5 1 3
1 2 1 3 4
6
4
8
6
5
8
*/


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       char [] a=new char[n];
    
       for(int x=0;x<=n-1;x++)
       {
           a[x]=sc.next().charAt(0);
       }
       boolean b[]=new boolean[n];
       int c[]=new int[n];
       for(int x=0;x<=a.length-1;x++)
       {
           if(b[x])
           continue;
           int count=1;
           for(int y=x+1;y<=a.length-1;y++)
           {
               if(a[x]==a[y])
               {
                   count++;
                   b[y]=true;
               }
           }
           if(count%2!=0)
           {
               System.out.println(a[x]);
               break;
           }
          
           
       }
    }
}

/*
output:
7
r g b b g y y
r

*/




		
		

	
































