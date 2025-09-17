class Mintosec
{
	public static void main(String [] args)
	{
		int min=2;
		int sec=500;
    		double min_sec;
		double sec_min;
		min_sec=min*(60.0);
		sec_min=sec/60.0;
		System.out.println("minutes to seconds: "+min_sec+"seconds");
		System.out.println("seconds to minutes: "+Math.round(sec_min)+"minutes");
	}
}


		
		