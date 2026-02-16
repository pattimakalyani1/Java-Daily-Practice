class Pat
{
	public static void main(String [] args)
	{
		int rows=4,cols=5;
		int temp=1;
		for(int r=1;r<=rows;r++)
		{
			int s=cols-1;
			for(int c=1;c<=cols;c++)
			{
				if(r%2!=0)
				{
					System.out.print(temp);
					temp++;
				}
				else
				{
					System.out.print(temp+s);	
					s--;
				}
			}
			if(r%2==0)
			{
				temp=temp+cols;
			}
			System.out.println();
		}
	}
}


class Pat1
{
	public static void main(String [] args)
	{
		int num=1;
		int rows=5;
		for(int r=1;r<=rows;r++)//1
		{
			for(int c=1;c<=r;c++)
			{
				
				while(true)
				{
					int count=0;
				
					if(num==1)
						break;
					for(int x=2;x<=num/2;x++)
					{
						if(num%x==0)
						{
							count++;
							break;
						}
					}
					if(count>0)
						break;
					num++;
				}
				System.out.print(num);
				num++;
			}
			System.out.println();
		}

	}
}



class Pat2
{
	public static void main(String [] args)
	{
		int num=1;
		int rows=5;
		for(int r=1;r<=rows;r++)//1
		{
			int [] arr=new int[r];
			
			for(int c=0;c<r;c++)
			{
				
				while(true)
				{
					int count=0;
				
					if(num==1)
						break;
					for(int x=2;x<=num/2;x++)
					{
						if(num%x==0)
						{
							count++;
							break;
						}
					}
					if(count>0)
						break;
					num++;
				}
				arr[c]=num;
				num++;
			}
			
			if(r%2!=0)
			{
				for(int x=0;x<=arr.length-1;x++)
				{
					System.out.print(arr[x]+" ");
				}
			}
			else
			{
				for(int x=arr.length-1;x>=0;x--)
				{
					System.out.print(arr[x]+" ");
				}
			}
			System.out.println();
			
			
		}

	}
}


class Freq
{
	public static void main(String [] args)
	{
		String s="tactoro";
		boolean[] b=new boolean[s.length()];
		char a[]=s.toCharArray();
		for(int x=0;x<=a.length-1;x++)
		{
			if(b[x]==true)
				continue;
			int count=1;
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=true;
				}
			}
			if(b[x]==false)
			System.out.println(a[x]+"-"+count);
		}
	}
}


class Test {
    int a = 100;  // field initializer

	{
		a=200;
	}

    Test() {
        
        a = 500;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.a);
    }
}


class Singleton
{
	private static Singleton instance;
	
	private Singleton()
	{
		System.out.println("singleton constructor");
	}
	
	public static Singleton getInstance()
	{
		if(instance==null)
		{
			instance=new Singleton();
		}
		return instance;

	}
}

class Single
{
	public static void main(String [] args)
	{
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.println(s2);
		System.out.println(s1);
		System.out.println(s1==s2);
	}
}


	




					
	
					
			