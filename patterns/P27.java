class P27
{
	public static void main(String [] args)
	{
	int rows=3,cols=3;
	
	for(int r=1;r<=rows;r++)
	{
		char letter='A';
		for(int c=1;c<=cols;c++)
		{
			System.out.print(letter+" ");
			letter++;
		}
		System.out.println();
	}
	}
}



class P28
{
	public static void main(String [] args)
	{
	int rows=3,cols=3;
	char letter='A';
	
	for(int r=1;r<=rows;r++)
	{
		
		for(int c=1;c<=cols;c++)
		{
			System.out.print(letter+" ");
			
		}
		System.out.println();
		letter++;
	}
	}
}
	


class P29
{
	public static void main(String [] args)
	{
	int rows=4,cols=4;
	char letter='A';
	for(int r=1;r<=rows;r++)
	{
		
		for(int c=1;c<=cols;c++)
		{
			if(r%2!=0)
			{
				System.out.print(letter+" ");
				
			}
			else
			{
				System.out.print((char)(letter+32)+" ");
				
			}
			letter++;
		}
		System.out.println();
		
	}
	}
}



class P30
{
	public static void main(String [] args)
	{
	int rows=4,cols=4;
	char letter='A';
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=cols;c++)
		{
			System.out.print(letter+" ");
			letter++;
		}
		letter=(char)(letter-(rows-r));
		System.out.println();
	}
	}
}
		
			
class P31
{
	public static void main(String [] args)
	{
	int rows=4,cols=4;
	char letter='A';
	char letter1=(char)(letter+32);
	for(int r=1;r<=rows;r++)
	{

		for(int c=1;c<=cols;c++)
		{
			if(r%2!=0)
			{
				System.out.print(letter+" ");
				letter++;
			}
			else
			{
				System.out.print(letter1+" ");
				letter1++;

			}
							
		}System.out.println();
		if(r%2!=0)
		{
			letter=(char)(letter+rows);
		}
		else
		{
			letter1=(char)(letter1+rows);
		}
	}
	}
}			


class P32
{
	public static void main(String [] args)
	{
	int rows=3,cols=4;
	char letter='A';
	
	for(int r=1;r<=rows;r++)
	{

		for(int c=1;c<=cols;c++)
		{
			if(c==2||c==4)
			{
				System.out.print((char)(letter+32)+" ");
			}
			else
			{
				System.out.print(letter+" ");
			}
			letter++;
		}System.out.println();
	}
	}
}
			















				