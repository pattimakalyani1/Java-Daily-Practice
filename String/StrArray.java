import java.util.Arrays;
class StrArray
{
	public static void main(String [] args)
	{
		String s="Hello all";
		String s1[]=s.split(" ");
		System.out.println("using split()methods printing  String array:");
		for(String temp:s1)
			System.out.println(temp);
		String [] a=new String[]{"hello","all","good","morning"};
		System.out.println(" printing  String array manually  :");
		for(String temp1:a)
			System.out.println(temp1);
	}
}


/*


using split()methods printing  String array:
Hello
all
 printing  String array manually  :
hello
all
good
morning


*/