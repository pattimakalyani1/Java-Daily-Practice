class StringBufferMethods
{
	public static void main(String [] args)
	{
		StringBuffer sb=new StringBuffer("hello all");
		System.out.println(sb.append(" good morning"));
		System.out.println(sb.delete(5,9));
		System.out.println(sb.deleteCharAt(8));
		//System.out.println(sb.reverse());
		System.out.println(sb.length());
		sb.setCharAt(1,'l');
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		sb.setLength(40);
		System.out.println(sb);
		System.out.println(sb.length());
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.replace(2,4,"helu all good"));
		System.out.println(sb.insert(5,"hal"));
		System.out.println(sb.insert(3,"hal"));

		
	}
}

/*

hello all good morning
hello good morning
hello god morning
17
hlllo god morning
l
hlllo god morning
40
hlllo
hlhelu all goodo
hlhelhalu all goodo

*/