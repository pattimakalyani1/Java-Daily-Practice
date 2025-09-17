class Palprarm
{
	public static void main(String [] args)
	{
	int count2=0,sum1=0;
	for(int i=1;i<=1000;i++)
	{
		int n=i,rev=0,temp=n;
		while(n!=0)
		{
			rev=rev*10+(n%10);
			n/=10;
		}
		if(temp==rev)
		{
			int count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && i>1)
			{
				n=i;
				int count1=0,sum=0;
				while(n!=0)
				{
					n/=10;
					count1++;
				}	
				n=i;
				while(n!=0)
				{
					sum=sum+(int)Math.pow((n%10),count1);
					n/=10;
				}
			
				if(temp==sum)
				{
					sum1+=temp;
					count2++;
					System.out.println(i+" Palindrome prime armstrong");
				}

			}
		}
		
	}
	System.out.println("no of palindromic prime armstrong "+count2);
	System.out.println("sum of palindromic prime armstrong "+sum1);

	}
}
















					
			
			