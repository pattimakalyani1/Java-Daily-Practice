class Bill
{
public static void main(String[] args)
{
String r="Arabian Mandi";
String address="kphb,kukatapally,pin code:560016";
long phone_number=899986567;
String item1="Chicken 65";
double item1_price=349;
int item1_quantity=3;
double item1_t_price=(item1_price*item1_quantity);
String item2="Fish fry";
double item2_price=400;
int item2_quantity=2;
double item2_t_price=(item2_price*item2_quantity);
String item3="Naan";
double item3_price=70;
int item3_quantity=3;
double item3_t_price=(item3_price*item3_quantity);
String item4="Mixed veg curry";
double item4_price=399;
int item4_quantity=2;
double item4_t_price=(item4_price*item4_quantity);
String item5="Biryani";
double item5_price=450;
int item5_quantity=3;
double item5_t_price=(item5_price*item5_quantity);
String item6="Cool drink";
double item6_price=80;
int item6_quantity=10;
double item6_t_price=(item6_price*item6_quantity);
String item7="milk pudding";
double item7_price=150;
int item7_quantity=3;
double item7_t_price=(item7_price*item7_quantity);
double total_price=(item1_t_price+item2_t_price+item3_t_price+item4_t_price+item5_t_price+item6_t_price+item7_t_price);
double cgst=9.0/100*total_price;
double sgst=9.0/100*total_price;
double gst=(cgst+sgst);
double bill=total_price+gst;
double discount=5.0/100*bill;
double final_bill=Math.round(bill-discount);
System.out.println("                                "+r);
System.out.println("                   "+ "Address  " +address);
System.out.println("                    "+"phone number "+phone_number);
System.out.println("-----------------------------------------------------------------------------------");
System.out.println("Item\t\t\tPrice\t    Quantity \t\t        price");
System.out.println(item1+"\t\t"+item1_price+"\t\t"+item1_quantity+"\t\t\t"+item1_t_price);
System.out.println(item2+"\t\t"+item2_price+"\t\t"+item2_quantity+"\t\t\t "+item2_t_price);
System.out.println(item3+"\t\t\t "+item3_price+"\t\t"+item3_quantity+"\t\t\t "+item3_t_price);
System.out.println(item4+"\t\t"+item4_price+"\t\t"+item4_quantity+"\t\t\t "+item4_t_price);
System.out.println(item5+"\t\t\t"+item5_price+"\t\t"+item5_quantity+"\t\t\t"+item5_t_price);
System.out.println(item6+"\t\t "+item6_price+"\t       "+item6_quantity+"\t\t\t "+item6_t_price);
System.out.println(item7+"\t\t"+item7_price+"\t\t"+item7_quantity+"\t\t\t "+item7_t_price);
System.out.println("-----------------------------------------------------------------------------------");
System.out.println("Total_price"+"                                                     "+total_price);
System.out.println("cgst(9%)"+"                                                         "+cgst);
System.out.println("sgst(9%)"+"                                                         "+sgst);
System.out.println("-----------------------------------------------------------------------------------");
System.out.println("gst"+"                                                              "+gst);
System.out.println("-----------------------------------------------------------------------------------");
System.out.println("Bill"+"                                                            "+bill);
System.out.println("Discount"+"                                                         "+discount);
System.out.println("-----------------------------------------------------------------------------------");
System.out.println("Final Bill"+"                                                      "+ final_bill);





}
}



