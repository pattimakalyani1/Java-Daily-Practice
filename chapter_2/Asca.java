class Asca
{
	public static void main(String [] args)
	{
	int n=56767,count=0,temp=n,rem=0,count1=0,temp1=n;
		while(n!=0)
		{
			n/=10;
			count++;
		}
		if(count%2==0)
		{
			while(temp!=0)
			{
				rem=temp%100;
				char c=(char)rem;
				System.out.println(c);
				temp/=100;
			}
		}
		else
		{     
			
			while(temp1!=0)
			{
			 count1++;
			if(count1<(count-3))
			{
				rem=temp1%100;
				char ch=(char)(rem);
				System.out.println(ch);
				temp1/=100;
			
			}
			else
			{
				rem=temp1%1000;
				System.out.println(rem);
				temp1/=1000;
			}
			
			}
		
		
		}
				
	}
}
				
				
	
