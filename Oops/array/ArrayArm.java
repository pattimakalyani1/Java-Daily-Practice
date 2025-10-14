import java.util.Scanner;	
class ArrayArm
{
	public static void main(String [] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("enter array number:");
		for(int x=0;x<=a.length-1;x++)
		a[x]=sc.nextInt();
		int count1=0;
		for(int x=0;x<=a.length-1;x++)
		{
			int number=a[x];
			int temp=number,temp1=number;
			int count=0,sum=0;
			while(number!=0)
			{
				count++;
				number/=10;
			}
		
			while(temp!=0)
			{
				sum=sum+(int)(Math.pow(temp%10,count));
				temp/=10;
			}
			if(temp1==sum)
			{
				count1++;
				System.out.println(a[x]+"  isArmstrong");
			}
		}
		System.out.println("no of armstrongs:"+count1);
	}
}
		

/*	

enter array number:
153
370
32
371
407
153 is Armstrong
370 is Armstrong
371 is Armstrong
407 is Armstrong
no of armstrongs:4

*/
		
//using methods

	
class ArrayArm1
{
	boolean isArm(int num)
	{
		        int number=num;
			int temp=number,temp1=number;
			int count=0,sum=0;
			while(number!=0)
			{
				count++;
				number/=10;
			}
		
			while(temp!=0)
			{
				sum=sum+(int)(Math.pow(temp%10,count));
				temp/=10;
			}
			if(temp1==sum)
			{
				
				return true;
			}
		return false;
	}
		
	public static void main(String [] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("enter array number:");
		for(int x=0;x<=a.length-1;x++)
		a[x]=sc.nextInt();
		int count1=0;
		ArrayArm1 ap=new ArrayArm1();
		for(int x=0;x<=a.length-1;x++)
		{
			boolean b=ap.isArm(a[x]);
			if(b)
			{
				count1++;
				System.out.println(a[x]+"Armstrong");
			}
		}
		System.out.println("no of Armstrongs in a array:"+count1);
	}
}

//using aray parameterized


class ArrayArm2
{
	int[] isArm(int [] b)
	{
		int [] d= new int [b.length];
		int count1=0;
		for(int x=0;x<=b.length-1;x++)
		{
		        int number=b[x];
			int temp=number,temp1=number;
			int count=0,sum=0;
			while(number!=0)
			{
				count++;
				number/=10;
			}
		
			while(temp!=0)
			{
				sum=sum+(int)(Math.pow(temp%10,count));
				temp/=10;
			}
			if(temp1==sum)
			{
				d[x]=b[x];
				count1++;
			}
		}
		int [] v=new int[count1];
		for(int x=0;x<=v.length-1;x++)
		{
			v[x]=d[x];
		}
		
		return v;
	}
	public static void main(String [] args)
	{
		int [] a= new int[]{153,307,371,23,470,307};
		ArrayArm2 aa=new ArrayArm2();
		int c[]=aa.isArm(a);
		for(int temp:c)
			System.out.print(temp+" ");
		System.out.println("no of armstrongs in a array:"+c.length);
	}
}
































class ArrayArm3
{
	int[] isArm(int [] b)
	{
		int [] d= new int [b.length];
		for(int x=0;x<=b.length-1;x++)
		{
		        int number=b[x];
			int temp=number,temp1=number;
			int count=0,sum=0;
			while(number!=0)
			{
				count++;
				number/=10;
			}
		
			while(temp!=0)
			{
				sum=sum+(int)(Math.pow(temp%10,count));
				temp/=10;
			}
			if(temp1==sum)
				d[x]=1;	
			else
				d[x]=0;
			
		}
		return d;
	}
	public static void main(String [] args)
	{
		int [] a= new int[]{153,307,371,370,23,45};
		ArrayArm3 aa=new ArrayArm3();
		int c[]=aa.isArm(a);
		for(int x=0;x<=c.length-1;x++)
		{
			if(c[x]==1)
				System.out.println(a[x]+" is armstrong");
		}
	}
}
		
		


			

	
