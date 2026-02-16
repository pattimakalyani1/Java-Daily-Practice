class Arreg
{
	public static void main(String [] args)
	{
		int a[]=new int[]{-1,1,0,-3,3};
		int b[]=new int[a.length];
		
		
		for(int x=0;x<=a.length-1;x++)
		{
			int prod=1;
			for(int y=0;y<=a.length-1;y++)
			{
				if(x!=y)
				{
					prod=prod*a[y];
				}
			}
			b[x]=prod;
		}
		
		for(int temp:b)
			System.out.print(temp+" ");
	}
}



class Arreg1
{
	public static void main(String [] args)
	{
		int a[]=new int[]{10,4,8,3};
		int b[]=new int[a.length];
		for(int x=0;x<=a.length-1;x++)
		{
			int prod=0,prod1=0;
			for(int y=x-1;y>=0;y--)
			{
				prod=prod+a[y];
			}
			for(int z=x+1;z<=a.length-1;z++)
			{
				prod1=prod1+a[z];
			}
			int res=(int)(Math.abs(prod-prod1));
			b[x]=res;
		}
		for(int temp:b)
			System.out.print(temp+" ");
	}
}


class Arreg2
{
	public static void main(String [] args)
	{
		int [][]a=new int [][]{{1,2,3},{5,17,7},{9,11,10}};
		int max_prime=0;
		for(int r=0;r<=a.length-1;r++)
		{
			
			for(int c=0;c<=a[r].length-1;c++)
			{
				if(c==r||c+r==a[r].length-1)
				{
					int num=a[r][c];
					int count=0;
					for(int x=2;x<=num/2;x++)
					{
						if(num%x==0)
						{
							count++;
							break;
						}
						if(count==0)
						{
							int prime=num;
							if(prime>max_prime)
							{
								max_prime=prime;
							}
						}
					}
				}
			}
		}System.out.println(max_prime);
	} 
}








	





				




			
			
			