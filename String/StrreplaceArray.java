class StrreplaceArray
{
	public static void main(String [] args)
	{
		String s[]=new String[]{"apple","banana","grapes"};
		for(int x=0;x<=s.length-1;x++)
		{
			if(s[x].equals("grapes"))
			{
				s[x]="pineapple";
			}
		}
		for(String temp:s)
			System.out.println(temp);
	}
}


/*

apple
banana
pineapple

*/