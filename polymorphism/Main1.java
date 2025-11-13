//final 
class Child extends Parent
{
	public static void main(String [] args)
	{
		
	}

		void m2()
		{
			System.out.println("child");
		}

}
class Parent
{
	 final void m2()
	{
		System.out.println("parent");
	}
}


/*

C:\Users\patti\OneDrive\Desktop\core java practice\polymorphism>javac Main1.java
Main1.java:9: error: m2() in Child cannot override m2() in Parent
                void m2()
                     ^
  overridden method is final
1 error

*/
		
		


           