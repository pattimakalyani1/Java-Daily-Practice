class Arr
{
	public static void main(String [] args)
	{
		int n[]=new int[]{6,1};
		for(int x=0;x<=n.length-1;x++)
		{
			for(int y=x;y<=n.length-1;y++)
			{
				for(int z=x;z<=y;z++)
				{
					
					int a=n[z];
					System.out.println(a+" ");
					
				}//System.out.println();
			}
		}	
	}
}
				