import java.io.*;
class File
{
	public static void main(String [] args)
	{
		
		try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write("Hello, this is text written into a file!");
            fw.close();
            System.out.println("File written successfully.");
		System.out.println(new java.io.File("output.txt").getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

		

		