import java.io.*;
class Text
{
	public static void main(String [] args)
	{
		try
		{
			FileWriter fw=new FileWriter("file.txt");
			fw.write("hello all");
			fw.close();
			System.out.println("text is converted into file");
		}
		catch(IOException e)
		{
			System.out.println("IoException");
		}
	}
}