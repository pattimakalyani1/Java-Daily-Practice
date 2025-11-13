//final variable
class Main
{
	public static void main(String [] args)
	{
		final int x=10;
		x=x+10;
		System.out.println(x);
	}
}

//C:\Users\patti\OneDrive\Desktop\core java practice\polymorphism>javac Main.java
Main.java:7: error: cannot assign a value to final variable x
                x=x+10;
                ^