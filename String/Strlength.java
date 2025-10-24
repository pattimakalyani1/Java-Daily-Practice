import java.util.Arrays;
class Strlength
{
	public static void main(String [] args)
	{
		String s="Hello";
		System.out.println("length of the string:"+ s.length());
		char [] c=s.toCharArray();
		int count=0;
		for(int x=0;x<=c.length-1;x++)
		{
			count++;
		}
		System.out.println("length of string without using length method:"+count);
	}
}
		

/*

length of the string:5
length of string without using length method:5

*/