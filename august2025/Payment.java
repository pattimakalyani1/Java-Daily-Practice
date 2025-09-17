class Payment
{
	public static void main(String[]args)
	{
		double payment=10000;
		String p_mode="offline";
		String t_mode="cash";
		double discount;
		double final_payment;
		/*if(p_mode=="online")
		{
			if(t_mode=="upi")
			{
				discount=15.0/100*payment;
			
			}
			else
			{
				discount=10.0/100*payment;
				
			}
		}
		else
		{
			if(t_mode=="cash")
			{
				discount=5.0/100*payment;
				
			}
			else
			{
				discount=0;
				
			}
		}*/
		/*if(p_mode=="online")
   		{
			discount=(t_mode=="upi")?(15.0/100*payment):(10.0/00*payment);
		}
		else
		{
			discount=(t_mode=="cash")?(5.0/100*payment):0;
		}*/
     		discount=(p_mode=="online")?((t_mode=="upi")?(15.0/100*payment):(10.0/00*payment)):((t_mode=="cash")?(5.0/100*payment):0);

		
		final_payment=payment-discount;
		System.out.println("payment is "+payment);
		System.out.println("payment mode is "+p_mode);
		System.out.println("trasaction mode id "+t_mode);
		System.out.println("discount for "+t_mode+" is "+discount);
		System.out.println("payment after discount is "+ final_payment);
	}
}