class Product
{
	public static void main(String [] args)
	{
	int code=520015;
	String p_name="bedsheets";
	double p_price=105.56;
	int quantity=4;
	double t_amount=p_price*quantity;
	double discount=7.5/100*t_amount;
	double final_amount=t_amount-discount;
	System.out.println("Product code: "+code);
	System.out.println("Product name: "+p_name);
	System.out.println("Product price: "+p_price);
	System.out.println("Product quantity: "+quantity); 
	System.out.println("Final amount: "+final_amount);
	}
}