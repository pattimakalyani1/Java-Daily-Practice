class Zero
{
	public static void main(String [] args)
	{
		int n=6200,count=0,rem=0,count1=0,dif,rev=0,rem2=0;
		while(n!=0)
		{
			count++;
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
				
		while(rev!=0)
		{
			count1++;
			rem2=rev%10;
			switch(rem2)
			{
				case 1->System.out.println("one");
				case 2->System.out.println("two");
				case 3->System.out.println("three");
				case 4->System.out.println("four");
				case 5->System.out.println("five");
				case 6->System.out.println("six");
				case 7->System.out.println("seven");
				case 8->System.out.println("eight");
				case 9->System.out.println("nine");
				default-> System.out.println("zero");
			}
			rev/=10;
		}
		dif=count-count1;
		while(dif!=0)
		{
			System.out.println("zero");
			dif--;
		}
	}
}
				







