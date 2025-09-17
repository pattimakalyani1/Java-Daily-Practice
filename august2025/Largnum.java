class Largnum
{
	public static void main(String[] args)
	{
		int num1=6,num2=9,num3=19;
		String large;
		/*if(num1>num2)
		{
			if(num1>num2)
			{
				System.out.println(num1 +" is largest number");
			}
			else
			{
				System.out.println(num3+ " is largest number");
			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println(num2+" is largest number");
			}
			else
			{
				System.out.println(num3 +" is largest number");
			}
		}*/
		/*if(num1>num2)
		{
			large=(num1>num3)?(num1+" is largest number"):(num3+" is largest number");
		}
		else
		{
			
			large=(num2>num3)?(num2+" is largest number"):(num3+" is largest number");
		}
     		System.out.println( large);*/
		large=(num1>num2)?((num1>num3)?(num1+" is largest number"):(num3+" is largest number")):((num2>num3)?(num2+" is largest number"):(num3+" is largest number"));
		System.out.println(large);


				
	}
}