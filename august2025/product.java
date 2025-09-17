class Main
{
   public static void main(String[] args)
   {
       String p_name="pens";
       double p_price=100.45;
       String rating="*****";
       int quantity=3;
       double t_price=p_price*quantity;
       double gst=(18*t_price)/100;
       double final_bill=(t_price+gst);
       System.out.println("Product Name:"+p_name);
       System.out.println("Product price:"+p_price);
       System.out.println("Rating:"+rating);
       System.out.println("Quantity:"+quantity);
       System.out.println("Total price:"+t_price);
       System.out.println("Gst(18%):"+gst);
       System.out.println("Final bill:"+final_bill);
       System.out.println("Final bill:"+ (int)(final_bill));
   }
}