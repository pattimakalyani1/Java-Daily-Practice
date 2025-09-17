class Coun
{
	public static void main(String [] args)
	{
		int count=0,count1=0,count2=0,count3=0;
		for(int i=0;i<=127;i++)
		{
		if(i>='A' && i<='Z'||i>='a'&&i<='z')
		{
			count1++;
		}
		else if(i>=48 && i<=57)
		{
			count++;
		}
		else if(i==' ')
		{
			count2++;
		}
		else
		{
			count3++;
		}
		}System.out.println("no of alphabets "+count1);
		System.out.println("no of digits "+count);
		System.out.println("no of symbols "+count3);
		System.out.println("no of spaces "+count2);

			
	}
}
			