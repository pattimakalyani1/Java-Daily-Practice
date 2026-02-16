import java.util.*;
class Student
{
	public static void main(String [] args)
	{
		Student s=new Student();
		int input=371;
		int count1=s.digitsCount(input,0);
		int sum=s.digitSum(input,0,count1);
		System.out.println(sum==input?"arm":"not arm");
		
	}
	int digitsCount(int num,int count)
	{
		if(num==0)
		{
			return count;
		}
		else
		{
			count=count+1;
			num=num/10;
			return digitsCount(num,count);
		}
	}
	int digitSum(int num,int sum,int count1)
	{
		if(num==0)
		{
			return sum;		
		}
		else
		{
			sum=sum+(int)Math.pow((num%10),count1);
			num=num/10;
			return digitSum(num,sum,count1);
		}
	}
}


class Ar
{
	public static void main(String [] args)
	{
		int a[]={1,2,3,4,5,6};
		Ar ar=new Ar();
		ar.arrSum(a,0,0);
	}
	void arrSum(int a[],int sum,int index)
	{
		if(index==a.length)
		{
			System.out.println(sum);
		}
		else
		{
			sum=sum+a[index];
			index=index+1;
			arrSum(a,sum,index);
		}
	}
}

class Bs
{
	public static void main(String [] args)
	{
		int a[]={1,2,4,5,6,3};
		Arrays.sort(a);
		int start=0,end=a.length-1;
		
		Bs b=new Bs();
		int search=5;
		b.binarySearch(a,search,start,end);

	}
	void binarySearch(int a[],int search,int start,int end)
	{
		
		if(start>end)
		{
			System.out.println(mid);
		}
		else
		{
			if(a[mid]>search)
			{	
				end=mid-1;
			}
			else if(a[mid]<search)
			{
				start=mid+1;
			}
			else
			{
				a[mid]=search;
			}
			binarySearch(a,search,start,end);
			
		}int  mid=(start+end)/2;
	}	
		
		
}

		
		


























