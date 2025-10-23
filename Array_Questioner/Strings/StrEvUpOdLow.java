class Str1EvUpOdLow
{
	public static void main(String [] args)
	{
		String s=new String("hello all good morning evening");
		String a[]=s.split(" ");
		String b="";
		for(int x=0;x<=a.length-1;x++)
		{
			if(x%2==0)
			{
				b=b+a[x].toUpperCase()+" ";
			}
			else 
				b=b+a[x].toLowerCase()+" ";
			
		}
		System.out.println(b);
	}
}


/*

HELLO all GOOD morning EVENING

*/
