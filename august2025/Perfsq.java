class Perfsq
{
	public static void main(String [] args)
	{
		int num=16;
		double d;
		d=Math.sqrt(num);
		/*if(temp%1==0)
		{
			System.out.println(num +" is perfect square");
		}
		else
		{
			System.out.println(num +" not a perfect square");
		}*/

//alternate logic
  		/*if(0<(int)d/(d)&&(int)d/d<1)
		{
			System.out.println(num +" is  not a perfect square");
		}
		else
		{
			System.out.println(num +" is perfect square");
		}*/
//alternate logic

		int res=(int)(d);
		if(res==d)
		{
			System.out.println(num +" is perfect square");
		}
		else
		{
			System.out.println(num +" is  notperfect square");
		}
			
	}
}
			