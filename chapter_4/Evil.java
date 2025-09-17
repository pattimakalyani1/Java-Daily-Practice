class Evil
{
	public static void main(String [] args)
	{
	int n=9,rem=0,sum=0;
	int m=(int)Math.pow(n,2);
	
	while(m!=0)
	{
		rem=m%10;
		sum=sum+rem;
		//System.out.println(sum);
		m/=10;
	}
	System.out.println(sum==n?"Evil number":"not a Evil number");
	}
}
	

class Sump
{
	public static void main(String [] args)
	{
	int n=132,rem=0,sum=0,pro=1;
	while(n!=0)
	{
		rem=n%10;
		sum=sum+rem;
		pro=pro*rem;
		n/=10;
	}
	//System.out.println(sum);
	//System.out.println(pro);
	System.out.println(sum==pro?"Power number":"not a power number");
	}
}


class Auto
{
	public static void main(String [] args)
	{
	int n=76,count=0,n1=n;
	int m=(int)Math.pow(n,2);
	
	while(n!=0)
	{
		n/=10;
		count++;
	}
	//System.out.println(count);	
	int x=(int)Math.pow(10,count);
	System.out.println(m%x==n1?"Automatic number":"not a automatic number");
	}
}
	
		
class Tech
{
	public static void main(String [] args)
	{
		int n=2025,temp=n,count=0,n1,n2,sum=0;
		while(n!=0)
		{
			n/=10;
			count++;
		}
		n1=temp%(int)(Math.pow(10,count/2));
		n2=temp/(int)(Math.pow(10,count/2));
		//System.out.println(n1);
		//System.out.println(n2);
		sum=n1+n2;
		int sq=(int)Math.pow(sum,2);
		System.out.println(sq);
		System.out.println(sq==temp?"Technology number":"Not a Technology number");
	}
}
		

class Busy
{
	public static void main(String [] args)
	{
	int n=730,rev=0,lasdig=0,temp=n;
	while(n!=0)
	{
		rev=rev*10+(n%10);
		n/=10;
	}
	lasdig=rev%10;
	System.out.println(lasdig);
	if(lasdig==7)
	{
		System.out.println("busy number");
	}
	else if(temp%7==0)
	{
		System.out.println("Busy number");
	}
	else
	{
		System.out.println("not a busy number");
	}
	}	
}


class Inav
{
	public static void main(String [] args)
	{
	int n=123;
	while(n>10)//0
	{
	int rem=0,sum=0;
	while(n!=0)//199
	{
		rem=n%10;
		sum=sum+rem;//19
		//System.out.println(sum);
		n/=10;//19//1//0
	}
		//System.out.println(sum);
		n=sum;
	}
	//System.out.println(n);
	System.out.println(n==1?"Inav number":"not a inav Number");
	}
}
		

class Sec
{
	public static void main(String [] args)
	{
	int n=5698,rem=0,max=0,count=0,temp=n;
	while(n!=0)
	{
		rem=n%10;
		if(rem>max)
		{
			count++;
			max=rem;
		}
		n/=10;
	}
	System.out.println(count);
	int rem1=0,rem2=0,rev=0;
	while(temp!=0)
	{
		rem1=temp%10;
		if(rem1==max);
		{
			rem2=0;
			rev=rev*10+rem2;
		}
		else
		{
			rev=rev*10+rem1;
		}
	
		temp/=10;
	}
	System.out.println(rev);
	}
	
}
	
























	