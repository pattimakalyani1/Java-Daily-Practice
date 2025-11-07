class Two
{
	public static void main(String []args)
	{
	
		Bruno bruno=new Bruno(2,"male");
		System.out.println(bruno.printKalyani());
		System.out.println(bruno.printBruno());	
	
	}
}
class Kalyani
{
	int id;
	String gender;
	Kalyani(int id,String gender)
	{
		
		this.id=id;
		this.gender=gender;
	}
	String printKalyani()
	{
		return id+" "+gender;
	}
}
class Bruno extends Kalyani
{
	int id1;
	String gender1;
	Bruno(int id1,String gender1)
	{
		super(1,"female");
		this.id1=id1;
		this.gender1=gender1;
	}
	String printBruno()
	{
		return id1+" "+gender1;
	}
}


/*

1 female

2 male

*/