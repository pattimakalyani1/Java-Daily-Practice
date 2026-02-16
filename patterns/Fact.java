class Fact
{
	public static void main(String [] args)
	{
		Fact f=new Fact();
	
		f.factRec(6,1);
	}
	
	void factRec(int num,int fact)
	{
		if(num<1)
		{
			System.out.println(fact);
		}
		else
		{
			fact=fact*(num);
			num=num-1;
			factRec(num,fact);
		}
	}
}

class High
{
	int small,high;
	public static void main(String [] args)
	{
		
		High h=new High();
		
		int smalll=h.small(12,24);
		h.highCom(12,24+,smalll);
	}
	int small(int num1,int num2)
	{
	if(num1>num2)
	{
		small=num2;

	}
	else{
		small=num1;
	}
	return small;
	}
	void highCom(int num1,int num2,int smalll)
	{
		if(smalll==0)
		{
			System.out.println(high);
		}
		else
		{
			if(num1%smalll==0 && num2%smalll==0)
			{
				high=smalll;
				smalll=0;
				
				
			}
			else{
			smalll=smalll-1;
			}
			highCom(num1,num2,smalll);
		}
	}
}

/*class High {
    public static void main(String[] args) {
        High h = new High();

        int small = h.small(12, 6);
        h.highCom(12, 6, small);
    }

    int small(int num1, int num2) {
        if (num1 > num2) {
            return num2;
        } else {
            return num1;
        }
    }

    void highCom(int num1, int num2, int smalll) {
        if (smalll == 0) {
            return;
        }
	else{

        if (num1 % smalll == 0 && num2 % smalll == 0) {
            System.out.println("HCF = " + smalll);
            return;  
        }
	}

        highCom(num1, num2, smalll - 1);
    }
}*/

class Prime
{
	public static void main(String [] args)
	{
		Prime p=new Prime();
		p.isPrime(100,2,0);
		p.isPrime1(100,2,0);
	}
	void isPrime(int num,int start,int count)
	{
		
		if(start==num)
		{
			if(count==0)
				System.out.println(" Prime");
			else
				System.out.println("not prime");
		}
		else
		{
			if(num%start==0)
			{
				
				count=count+1;	
			}
			start=start+1;	
			isPrime(num,start,count);
		}
	}
		void isPrime1(int num,int start,int count)
		{
			if(start<=num)
			{
				if(num%start==0)
				{
					count=count+1;	
				}
				start=start+1;	
				isPrime1(num,start,count);
			}
			else
			{
				if(count==0)
					System.out.println(" Prime");
				else
					System.out.println("not prime");
			}
		}

				
				
	
}
	
		
					
				
			
		
		
			
		
	