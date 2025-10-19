import java.util.Arrays;
class StringToArray
{
	public static void main(String[] args)
	{
		String s=new String("hello all");
		char[] a=s.toCharArray();
		//Arrays.sort(a);
		for(char temp:a)
			System.out.print(temp+"\t");
	}
}


/*

h       e       l       l       o               a       l       l

*/