import java.util.Scanner;
class Stationary
{
	public static void main(String [] args)
	{
		System.out.println("--------------welcome to XXX Stationary---------------------");
		Scanner  sc=new Scanner(System.in);
		//String choice="yes";
		int pc=10,e=5,penc=5,sum=0,quan=0;
		double ptotal=0;
		int pn=30,pg=30,pd=50,pp=40,gp=50,ps=30, ppc=5,pr=8,pcc=10,pcm=2,pgg=10,pdt=10,pf=5,pss=20,pC=30,pff=250,pdh=200,pee=100,pw=300,pgp=70,pi=40,pS=10,ppcs=30,ppm=50,pas=2,pcp=5,ppp=15,ppk=300,prb=70,pssp=25,sbw=250,lp=10,pcs=5, pwp=30,prs=10,ppdt=10, pc12=20,psp12=35,pcp12=40,pop=200,pwcs=30,sbs=150,plp=80,pdb=100,ptts=100,pttps=100,php=75, pgc=25,pwh=100,psdl=100,pfs=150,pwss=100,lpss=150;
		int ch=0,c1=0;
		Stationary s=new Stationary();
		int res=s.menu(sc);
		s.option(sc);
		
	}
	int menu(Scanner sc)
	{
		
			System.out.println("--------MENU----------------");
			System.out.println("1.School Items");
			System.out.println("2.Charts & Craft Items");
			System.out.println("3.Office Supplies");
			System.out.println("4.Printing & Paper Items");
			System.out.println("5.Art & Drawing Materials");
			System.out.println("6.Gift Items");
			System.out.println("7.Exit");
			System.out.println("enter your choice(1-7)");
			int ch=sc.nextInt();
			//return ch;
		
	}
	int sI(Scanner sc)
	{
		System.out.println("In School Items we have");
		System.out.println("1.Writing Materials");
		System.out.println("2.Books & Papers");
		System.out.println("3.Accessories");
		System.out.println("4.Exit");
		System.out.println("enter your choice(1-4):");
		int c=sc.nextInt();
		return c;
	}
	
	void option(Scanner sc)
	{
		switch(ch)
		{
			case 1:
				sI(sc);
				break;
		}
	}
	
	
		


	
	
}

