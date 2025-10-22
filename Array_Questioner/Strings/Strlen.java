class Strlen
{
	public static void main(String [] args)
	{
		String s=new String("hello");
		char c[]=s.toCharArray();
		int count=0;
		for(char temp:c)
		{
			count++;
			System.out.print(temp+" ");	
		}
		System.out.println();
		System.out.println("length of the array:"+count);
	}
}


/*


h e l l o
length of the array:5



*/	