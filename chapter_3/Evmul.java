class Evmul
{
	public static void main(String [] args)
	{
	int num=2;
	for(int i=1;i<=10;i++)
	{
		if(i%2==0)
		{
			System.out.println(num+"x"+i+"="+num*i);
		}
	}
	}
}

class Evmul1
{
	public static void main(String [] args)
	{
	int num=2;
	for(int i=1;i<=10;i++)
	{
		if(i%2!=0)
		{
			System.out.println(num+"x"+i+"="+num*i);
		}
	}
	}
}


class Evmul2
{
	public static void main(String [] args)
	{
	int num=3,sum=0;
	for(int i=1;i<=10;i++)
	{
		if(i%2!=0)
		{
			sum=sum+(num*i);

		}
	}System.out.println(sum);
	System.out.println(sum%2==0?"sum is even":"sum is odd");
			
	}
}

class Evmul3
{
	public static void main(String [] args)
	{
	int num=7,mul=0;
	for(int i=1;i<=10;i++)
	{
		mul=num*i;
		if(mul%2==0)
		{
			System.out.println(num+"x"+i+"="+num*i);
		}
	}
	}
}


class Evmul4
{
	public static void main(String [] args)
	{
	int num=3,mul=0;
	for(int i=1;i<=10;i++)
	{
		mul=num*i;
		if(mul%2!=0)
		{
			
			System.out.println(num+"x"+i+"="+num*i);
		}
	}
	}
}

class Ev1
{
	public static void main(String [] args)
	{
	int num=3,sum=0,count=0;
	for(int i=1;i<=10;i++)
	{
		if(i%2!=0)
		{
			sum=sum+(num*i);

		}
	}
	for(int i=2;i<=sum/2;i++)
	{
		if(sum%i==0)
		{
			count++;
			System.out.println("not a prime");
			break;
		}
	}
	if(count==0)
	System.out.println("prime number");
	}
}



class Ev2
{
	public static void main(String [] args)
	{
	int num=15,count=0;
	double d=0;	
	for(int i=1;i<=16;i++)
	{
	      d=Math.sqrt(num*i);
	      if(d%1==0)
	      { 
		count++;
		System.out.println(num+"x"+i+"="+num*i);
		}
	}
	System.out.println(count==0?"no perfect squres":"perfect squares");
	}
}
	
	
class Ev3
{
	public static void main(String [] args)
	{
	int count=0;
	for(int i=2400;i>=1600;i--)
	{
		if((i%4==0 && i%100!=0) ||i%400==0)
		{
			count++;
			System.out.println(i);
		}
	}System.out.println("no of leap years: " +count);
	}
}
		
			
	


			
