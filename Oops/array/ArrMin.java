class ArrMin
{
	public static void main(String [] args)
	{
		int[] a=new int []{10,20,4,54,89,65};
		int min=a[0];
		for(int temp:a)
		{
			if(temp<min)
			{
				min=temp;
			}
		}
		System.out.println(min);
	}
}

//using methods:

class ArrMin1
{
	public static void main(String [] args)
	{
		int[] a=new int []{10,20,4,54,89,65};
		Sample sample=new Sample();
		System.out.println("min in array: "+sample.calMin(a));
		System.out.println("max in array: "+sample.calMax(a));
	}
}
class Sample
{
	int calMin(int [] b)
	{
		int min=b[0];
		for(int temp:b)
		{
			if(temp<min)
			{
				min=temp;
			}
		}
		return min;
	}
	int calMax(int [] b)
	{
		int max=b[0];
		for(int temp:b)
		{
			if(temp>max)
			{
				max=temp;
			}
		}
		return max;
	}
}

/*

min in array: 4
max in array: 89

*/
