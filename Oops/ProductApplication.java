import java.util.Scanner;
class ProductApp
{
	public static void main(String [] args)
	{
		Product product=new Product();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		product.p_name=sc.next();
		System.out.println("enter price");
		product.p_price=sc.nextDouble();
		System.out.println("enter quantity");
		product.quantity=sc.nextDouble();
		System.out.println(product.calEachProduct());
		
	}
}
class Product
{
	String p_name;
	double p_price;
	double quantity;
	double bill;	
	double calEachProduct()
	{
		bill=p_price*quantity;
		return bill;
	}
}
		