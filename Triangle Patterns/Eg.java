class Eg
{
	public static void main(String [] args)
	{
	int rows=6;
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=r;c++)
		{
			if(c==1||r==c||r==rows)
			{
				System.out.print("#"+" ");
			}
			else
				System.out.print("$"+" ");
		}System.out.println();
	}
	}
}



class Eg1
{
	public static void main(String [] args)
	{
	int rows=6;
	for(int r=1;r<=rows;r++)
	{
		for(int c=r;c<=rows;c++)
		{
			System.out.print("#"+" ");
		}
		System.out.println();
	}
	}
}



class Eg2
{
	public static void main(String [] args)
	{
	int rows=6;
	for(int r=1;r<=rows;r++)
	{
		for(int c=r;c<=rows;c++)
		{
			if(r==1||r==c||c==rows)
			{
				System.out.print("#"+" ");
			}
			else
				System.out.print("  ");

		}
		System.out.println();
	}
	}
}




class Eg3
{
	public static void main(String [] args)
	{
	int rows=4;
	for(int r=1;r<=rows;r++)
	{
		int temp=r;
		for(int c=1;c<=r;c++)
		{
			System.out.print(temp+" ");
			temp--;
		}System.out.println();
	}
	}
}




class Eg4
{
	public static void main(String [] args)
	{
	int rows=4,temp=1;
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=r;c++)
		{
			System.out.print(temp+" ");
			temp++;
		}System.out.println();
	}
	}
}



class Eg5
{
	public static void main(String [] args)
	{
	int rows=4;
	for(int r=1;r<=rows;r++)
	{
		int temp=1;
		for(int c=r;c<=rows;c++)
		{
			System.out.print(temp+" ");
			temp++;
		}
		System.out.println();
	}
	}
}


class Eg6
{
	public static void main(String [] args)
	{
	int rows=5;
	for(int r=1;r<=rows;r++)
	{
		int temp=r;
		for(int c=1;c<=r;c++)
		{
			System.out.print(temp+" ");
			temp--;
		}
		System.out.println();
	}
	}
}


class Eg7
{
	public static void main(String [] args)
	{
	int rows=5;
	for(int r=1;r<=rows;r++)
	{
		int temp=r;
		for(int c=1;c<=r;c++)
		{
			if(c==1||r==rows||r==c)
			{
				System.out.print(temp+" ");
			
			}
			else
			{
				System.out.print("  ");
			}
			temp--;
		}
		System.out.println();
	}
	}
}
















