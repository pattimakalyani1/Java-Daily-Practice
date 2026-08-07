import java.util.*;
class Pattern
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows:");
		int rows=sc.nextInt();
	
	
		for(int r=1;r<=rows;r++)
		{
			int temp=r;
			for(int c=r;c<=rows;c++)
			{
				System.out.print("  ");
			}
			
			for(int c=1;c<=r;c++)
			{
				System.out.print(temp+" ");
				temp++;
			}
			temp=temp-2;
			for(int c=2;c<=r;c++)
			{
				System.out.print(temp+" ");
				temp--;
			}
			System.out.println();
		}
		
		
		
	}
}