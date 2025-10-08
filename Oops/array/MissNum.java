class MissNum
{
	public static void main(String [] args)
	{
		int [] a= new int[]{1,2,4,6,7,1,2,4};
		
		for(int x=0;x<=9;x++)
		{
			boolean found=false;
			for(int y=0;y<=a.length-1;y++)
			{
				if(x==a[y])
				{
				found=true;
				break;
				}
			
					
			}
			if(found==false)
			{
				System.out.println(x);
			}
			
		}
	}
}
	
/*

0
3
5
8
9

*/
	
	