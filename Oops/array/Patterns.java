class Patterns
{
	public static void main(String [] args)
	{	
		int rows=5,cols=5;
		for(int r=0;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(c==r)
					System.out.print("&");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}
}



class P1
{
	public static void main(String [] args)
	{	int rows=5,cols=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(c==1||r==1||c==cols||r==rows)
				{
					System.out.print("#");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
	

class P2
{
	public static void main(String [] args)
	{	int rows=5,cols=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(c==1||c==cols||r==1||r==rows)
				{
					System.out.print("#");
				}
				else
					System.out.print("$");
			}
			System.out.println();
		}
	}
}
				
				
class P3
{
	public static void main(String [] args)
	{	int rows=5,cols=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r==1||r==rows)
				{
					System.out.print("#");
				}
				else
					System.out.print("$");
			}
			System.out.println();
		}
	}
}
				
class P4
{
	public static void main(String [] args)
	{	int rows=5,cols=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r+c==rows+1)
				{
					System.out.print("$");
				}
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}
}


class P5
{
	public static void main(String [] args)
	{	int rows=7,cols=7;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r+c==rows+1||r==1||c==1||r==rows||c==cols||r==c)
				{
					System.out.print("#");
				}
				else
					System.out.print("$");
			}
			System.out.println();
		}
	}
}

class P6
{
	public static void main(String [] args)
	{	int rows=7,cols=7;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(c%2==0&&r%2==0)
				{
					System.out.print("$");
				}
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}
}


class P7
{
	public static void main(String [] args)
	{	int rows=3,cols=3,temp=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				System.out.print(temp);
				temp++;
			}
			System.out.println();
	
		}
	}
}
		

class P8
{
	public static void main(String [] args)
	{	int rows=4,cols=4;
		for(int r=1;r<=rows;r++)
		{
			int temp=r;
			for(int c=1;c<=cols;c++)
			{
				System.out.print(temp);
				temp++;
			}
			System.out.println();
	
		}
	}
}


class P9
{
	public static void main(String [] args)
	{	int rows=5,cols=5;
		for(int r=1;r<=rows;r++)
		{
			
			for(int c=1;c<=cols;c++)
			{
				if(r==c)
					System.out.print(r);
				else if(r+c==rows+1)
					System.out.print(r);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

class P10
{
	public static void main(String [] args)
	{	int rows=3,cols=5;
		char ch='A';
		for(int r=1;r<=rows;r++)
		{
			
			for(int c=1;c<=cols;c++)
			{
				System.out.print(ch+" ");
				ch++;
				
			}
			System.out.println();
		}
	}
}


class P11
{
	public static void main(String [] args)
	{	int rows=4,cols=4;
		char ch='A';
		for(int r=1;r<=rows;r++)
		{
			int temp=r;
			for(int c=1;c<=cols;c++)
			{
				if(r%2!=0)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else
				{
					System.out.print(temp+" ");
					temp++;
				}
				
			}
			System.out.println();
		}
	}
}


class P12
{
	public static void main(String [] args)
	{	int rows=4,cols=4;
		char ch='A',temp='a';
		for(int r=1;r<=rows;r++)
		{	
			for(int c=1;c<=cols;c++)
			{
				if(r%2!=0)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else
				{
					System.out.print(temp+" ");
					temp++;
				}
				
			}
			System.out.println();
		}
	}
}


























































































































































			