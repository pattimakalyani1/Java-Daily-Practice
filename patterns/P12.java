class P12
{
	public static void main(String [] args)
	{
	int rows=3,cols=5,temp=65;
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=cols;c++)
		{
			System.out.print((char)temp);
			temp++;
		}
		System.out.println();
		
	}
	}
}


class P13
{
	public static void main(String [] args)
	{
		int rows=5,cols=5;
		for(int r=1;r<=rows;r++)	
		{
			for(int c=1;c<=cols;c++)
			{
				System.out.print(c);
			}System.out.println();
		}
	}
}





class P14
{
	public static void main(String [] args)
	{
		int rows=5,cols=5;
		for(int r=1;r<=rows;r++)	
		{
			for(int c=1;c<=cols;c++)
			{
				System.out.print(r);
			}System.out.println();
		}
	}
}




class P15
{
	public static void main(String [] args)
	{
		int rows=4,cols=4;
		for(int r=1;r<=rows;r++)	
		{
			int temp=r;
			for(int c=1;c<=cols;c++)
			{
				System.out.print(temp);
				temp++;
			}System.out.println();
			 
		}
	}
}


class P16
{
	public static void main(String [] args)
	{
		int rows=4,cols=4,temp=1;
		for(int r=1;r<=rows;r++)	
		{
			
			for(int c=1;c<=cols;c++)
			{
				System.out.print(temp+"   ");
				temp++;
			}
			System.out.println();
				temp=temp-3;

		}
	}
}



class P17
{
	public static void main(String [] args)
	{
		int rows=5,cols=5,temp=1;
		for(int r=1;r<=rows;r++)	
		{
			
			for(int c=1;c<=cols;c++)
			{
				if(r==c||r+c==rows+1)
				{
					System.out.print(r+" ");
				}
				else
				{
					System.out.print(" ");
				}

				
			}System.out.println();
		}
	}
}



class P18
{
	public static void main(String [] args)
	{
		int rows=5,cols=5,temp=1;
		for(int r=1;r<=rows;r++)	
		{
			
			for(int c=1;c<=cols;c++)
			{
				if(r==c||r+c==rows+1)
				{
					System.out.print(c+" ");
				}
				else
				{
					System.out.print(" ");
				}

				
			}System.out.println();
		}
	}
}

			

class P19
{
	public static void main(String [] args)
	{
		int rows=3,cols=3,temp=1;
		for(int r=1;r<=rows;r++)	
		{
			
			for(int c=1;c<=cols;c++)
			{
				System.out.print("1  ");
			}
		        System.out.println();
		}
	}
}
	


class P20
{
	public static void main(String [] args)
	{
		int rows=3,cols=3,temp=65;
		for(int r=1;r<=rows;r++)	
		{
			
			for(int c=1;c<=cols;c++)
			{
				System.out.print((char)temp+" ");
				temp++;
			}
			System.out.println();
		}
	}
}


class P21
{
	public static void main(String [] args)
	{
		int rows=3,cols=5;
		char temp=65;
		for(int r=1;r<=rows;r++)	
		{
			
			for(int c=1;c<=cols;c++)
			{
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}
	}
}


class P22
{
	public static void main(String [] args)
	{
		int rows=4,cols=4;
		char temp=65;
		for(int r=1;r<=rows;r++)	
		{
			int temp1=r;
			for(int c=1;c<=cols;c++)
			{
				if(r%2!=0)
				{
					System.out.print(temp+" ");
					temp++;
				}
				else{
					System.out.print(temp1+" ");
					temp1++;}
			}
			System.out.println();
		}
	}
}




class P23
{
	public static void main(String [] args)
	{
		int rows=4,cols=3;
		char temp=65;
		for(int r=1;r<=rows;r++)	
		{
			//int temp1=r;
			for(int c=1;c<=cols;c++)
			{
				if(r%2!=0)
				{
					System.out.print(temp+" ");
				
				}
				else
				{
					System.out.print((char)(temp+32)+" ");
				}
				temp++;	
			}
			System.out.println();
		}
	}
}



class P24
{
	public static void main(String [] args)
	{
	int rows=5;
	for(int r=rows;r>=1;r--)
	{
		for(int c=1;c<=r;c++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}
}




class P25
{
	public static void main(String [] args)
	{
	int rows=5;
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=r;c++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}
}



class P26
{
	public static void main(String [] args)
	{
	int rows=7,cols=7,num=4;
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=cols;c++)
		{
			if(r==1||c==1||r==rows||c==cols)
			{
				System.out.print(num);
			}
			else if(r==2||c==2||r==rows-1||c==cols-1)
			{
				System.out.print(num-1);
			}
			else if(r==3||c==3||r==rows-2||c==cols-2)
			{
				System.out.print(num-2);
			}
			else
			{
				System.out.print(num-3);
			}
		}
		System.out.println();
	}
	}
}

			
		































										