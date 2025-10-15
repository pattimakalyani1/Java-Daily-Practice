class SecMaxArr
{
	public static void main(String [] args)
	{
		int[] a=new int[]{60,50,90,60,20};
		int max=Integer.MIN_VALUE;
		int smax=max;
		for(int i=0;i<=a.length-1;i++)
		{
			if(max<a[i])
				max=a[i];
		}
		for(int i=0;i<=a.length-1;i++)
		{
			if(max!=a[i] && smax<a[i])
				smax=a[i];
		}
		System.out.println(smax);
	}
}

/*

60

*/

// without writing two loops
class SecMaxArr1
{
	public static void main(String [] args)
	{
		int[] a=new int[]{90,60,50,100,40};
		int max=Integer.MIN_VALUE;
		int smax=max;
		for(int i=0;i<=a.length-1;i++)
		{
			if(max<a[i])
			{
				smax=max;
				max=a[i];
			}
			else if(max!=a[i] && smax<a[i])
				smax=a[i];
		}
		System.out.println(smax);
	}
}

/*

90

*/

// 2 nd max element in a sorted array(descending order)
class SecMaxArr2
{
	public static void main(String [] args)
	{
		int[] a=new int[]{100,100,90,90,90,80,40};
		int count=1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				count++;
				if(count==2)
				{
					System.out.println(a[i+1]);
					break;
				}
			}
		}
	}
}

/*

90

*/

// 1 nd max element in a sorted array(descending order)
class MaxArr1
{
	public static void main(String [] args)
	{
		int[] a=new int[]{100,100,90,90,90,80,40};
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				count++;
				if(count==1)
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}

/*

100

*/
			
// 3rd max element in a sorted array(descending order)
class SecMaxArr3
{
	public static void main(String [] args)
	{
		int[] a=new int[]{100,100,90,90,90,80,40};
		int count=1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				count++;
				if(count==3)
				{
					System.out.println(a[i+1]);
					break;
				}
			}
		}
	}
}

/*

80

*/


// 2 nd max element in a sorted array(ascending order)
class SecMaxArr4
{
	public static void main(String [] args)
	{
		int[] a=new int[]{40,40,50,50,60,60,60,80};
		int count=1;
		for(int i=a.length-1;i>=1;i--)
		{
			if(a[i]!=a[i-1])
			{
				count++;
				if(count==2)
				{
					System.out.println(a[i-1]);
					break;
				}
			}
		}
	}
}

/*

60

*/


// 1 st max element in a sorted array(ascending order)
class MaxArr2
{
	public static void main(String [] args)
	{
		int[] a=new int[]{40,40,50,50,60,60,60};
		int count=0;
		for(int i=a.length-1;i>=1;i--)
		{
			if(a[i]!=a[i-1])
			{
				count++;
				if(count==1)
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}

/*

60

*/

























