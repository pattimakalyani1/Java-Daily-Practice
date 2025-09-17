class nestedif
{
 	public static void main(String [] args)
 	{
 		if(true)
 		{
 		System.out.println("inside outer if");
  			if(false)
  			{
   			System.out.println("inside inner if");
  			}else
  			{
  			System.out.println("inside else");
  			}
 		}else
 		{
  		System.out.println("outside else");
 		}
}
	}