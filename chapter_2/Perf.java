class Perf
{
	public static void main(String [] args)
	{
		int n=1469,rem=0;
		double c=0;
		while(n!=0)
		{
			rem=n%10;
			c=Math.sqrt(rem);
			if(c%1==0)
			{
			System.out.println(rem);
			}
			n/=10;
		}
	}
}


   

class Pairper
{
	public static void main(String [] args)
	{
		int n=1436,rem=0;
		double c=0;
		boolean present=false;
		while(n!=0)
		{
			rem=n%100;
			c=Math.sqrt(rem);
			if(c%1==0)
			{
			System.out.println(rem);
			present=true;
			}
			n/=100;
		}
		System.out.println(present?"present":"not present");
	}
}


class Sumperf
{
	public static void main(String [] args)
	{
		int n=1234564,rem=0,sum=0,rem1=0;
		double c=0;
		boolean present=false;
		while(n!=0)
		{
			rem=n%10;
			if(rem%2==0)
			{
				sum=sum+rem;
			}
			n/=10;
		}
		
			c=Math.sqrt(sum);
			if(c%1==0)
			
			present=true;
			
		
		
		System.out.println(present?"sum of even digits is perfect square":" sum of even digits is not present");
	}
}



class Sumodd
{
	public static void main(String [] args)
	{
		int n=12345641,rem=0,sum=0;
		while(n!=0)
		{
			rem=n%10;
			if(rem%2!=0)
			{
				sum=sum+rem;
			}
			n/=10;
		}
		if(sum%2==0)
		{
			System.out.println("sum of odd digit is even "+sum);
		}
		else
		{
			System.out.println("sum of odd digit is odd "+sum);

		}
	
	}
}
			

class Palarm
{
	public static void main(String [] args)
	{
		int n=121,rem=0,rev=0,sum=0,rem1=0,temp=n,count=0;
		while(n!=0)
		{
			++count;
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		int temp1=rev;
		if(rev==temp)
		{
			while(rev!=0)
			{
				rem1=rev%10;
				sum=sum+((int)(Math.pow(rem1,count)));
				rev/=10;
			}
			if(sum==temp1)
			{
				System.out.println("number is palindrome and armstrong");
			}
			else
			{
				System.out.println("number is palindrome but not armstrong");
			}
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}


class Mul
{
	public static void main(String [] args)
	{
		int n=145689,rem=0,count=0,sum=0,pro=1,rem1=0,sum1=0,count1=0;		
		while(n!=0)
		{
			++count;
			rem=n%10;
			if(count%2!=0)
			{
				sum=sum+rem;
			}
			else
			{
				pro=pro*rem;
			}
			n/=10;
		}
		int total=sum+pro;
		int temp=total,temp1=total;
		while(temp!=0)
		{
			count1++;
			temp/=10;
		}
		while(total!=0)
		{
			rem1=total%10;
			sum1=sum1+((int)(Math.pow(rem1,count1)));
			total/=10;
		}
		System.out.println(sum==temp1?"  sum of odd position digits + multiplication of even position digits is armstrong":" sum of odd position digits + multiplication of even position digits isnot a armstrong");
	}
}

			
class Twistarm
{
	public static void main(String [] args)
	{
		int n=153,rem=0,sum=0,count=0,temp=n,temp1=n,rem1=0,rev=0,rem2=0,sum1=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+((int)(Math.pow(rem,count)));
			temp/=10;
		}
		if(sum==temp1)
		{
			while(sum!=0)
			{
				rem1=sum%10;
				rev=rev*10+rem1;
				sum/=10;
			}
			int temp_rev=rev;
			while(rev!=0)
			{
				rem2=rev%10;
				sum1=sum1+((int)(Math.pow(rem2,count)));
				rev/=10;
			}
		System.out.println((sum1==temp_rev)?"number is twisted armstrong":"number is not a twisted armstrong");	
		
		}
		else
		{
			System.out.println(" not a armstrong");	
		}
	}
}


class Smp
{
	public static void main(String [] args)
	{
		int n=23456,rem=0,count=0,temp=n,temp1=n,rem1=0,rem2=0,rev=0;
		while(n!=0)
		{
			count++;
			rem=n%10;
			
			rev=rev*10+rem;
			n/=10;
		}
	
		int start=1,end=count/2;
		while(start<=end)
		{
			rem1=temp%10;
			rem2=rev%10;
			System.out.println(rem1+rem2);
			temp/=10;
			rev/=10;
			start++;
		}
		 if(count%2!=0)
		{
			System.out.println(temp%10);
		}
	}
}
		
class Num
{
	public static void main(String [] args)	
	{
		long n=345623445667l,count=0,temp=n,n1=0,n2=0,sum1=0,sum2=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		long half=count/2;
		
		long c=(long)(Math.pow(10,half));
		n1=temp%c;
		n2=temp/c;
		while(n1!=0)
		{
			sum1=sum1+(n1%10);
			n1/=10;
		}
		
		while(n2!=0)
		{
			sum2=sum2+(n2%10);
			n2/=10;
		}
		long pro=sum1*sum2;
		System.out.println(pro);
		while(pro!=0)
		{
		System.out.println(pro%10);
		pro/=10;
		}
	}
}
			



class Num1
{
	public static void main(String [] args)
	{
		int n=345223245,count=0,rem=0;
		boolean found=false;
		while(n!=0)
		{
			rem=n%10;
			if(rem==2)
			{
				count++;
				found=true;
			}
			n/=10;
		}
		System.out.println(found?"found":"not found");
		System.out.println(count);
	}
}																																														 

class Num2
{
	public static void main(String [] args)
	{
		int n=8943,rem=0,pro=0,temp=n,count=0,count1=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		n=temp;
		while(n!=0)
		{
		count1++;
		rem=n%10;//3//4//9//8
		n/=10;//894//89//8//0
		pro=n%10;//4//9//8//0
		if(count1<count)
		System.out.println((int)(Math.pow(rem,pro)));
		else
		System.out.println((int)(Math.pow(rem,rem)));
		}
		
		}
}																																																																																																																																																			






















