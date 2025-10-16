class MatrixArrArm
{
	public static void main(String [] args)
	{
		int [][] a=new int[][]{{153,131,371},{370,121,6}};
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{  	
				int count=0,temp=a[r][c],temp1=a[r][c],sum=0;
				while(a[r][c]!=0)
				{
					count++;
					a[r][c]/=10;
				}
				while(temp!=0)
				{
					sum=sum+((int)Math.pow((temp%10),count));
					//System.out.println(sum);
					temp/=10;
				}
				if(temp1==sum)	
					System.out.println(sum);
			}
		}
	}
}


/*

153
371
370
6

*/				