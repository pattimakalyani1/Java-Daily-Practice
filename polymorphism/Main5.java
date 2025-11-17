class Encap
{
	private String user;
	private String password;
	
	public void setUser(String user)
	{
		this.user=user;
	}
	
	public void getUser()
	{
		System.out.println(user);
	}

	public void setPassword(String password)
	{
		this.password=password;
	}
	
	public void getPassword()
	{
		System.out.println(password);
	}

}

class main
{
	public static void main(String [] args)
	{
		Encap e=new Encap();
		e.setUser("kalyani123");
		e.setPassword("kavya@144433");
		e.getUser();
		e.getPassword();
	}
}


/*

kalyani123
kavya@144433

*/
