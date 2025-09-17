class Noprime
{
	public static void main(String [] args)
	{
	int x,count1=0,sum=0;
		for(x=478;x<=658;x++)
		{	
			int i,count=0,num=x;
			for(i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0){
			count1++;
			sum+=num;
			System.out.println(num);}
		}System.out.println("count is "+count1);
		System.out.println("sum is "+sum);
	}
}
		























	
