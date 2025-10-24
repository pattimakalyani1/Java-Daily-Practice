import java.util.Arrays;
class Str2
{
	public static void main(String [] args)
	{
		String s="hello";
		System.out.println(s+":"+System.identityHashCode(s));//79814996
		s.concat("all");//not storing s
		System.out.println(s+":"+System.identityHashCode(s));//798154996

		s=s+"all";//storing in s
		System.out.println(s+":"+System.identityHashCode(s));//303563356

		System.out.println();

		StringBuffer buf=new StringBuffer("i am buffer");
		System.out.println(buf+":"+System.identityHashCode(buf));
		buf.append("all");
		System.out.println(buf+":"+System.identityHashCode(buf));

		System.out.println();

		StringBuilder bui=new StringBuilder("i am builder");
		System.out.println(bui+":"+System.identityHashCode(bui));
		bui.append("all");
		System.out.println(bui+":"+System.identityHashCode(bui));
		
	}
}



/*


hello:798154996
hello:798154996
helloall:303563356

i am buffer:135721597
i am bufferall:135721597

i am builder:142257191
i am builderall:142257191


*/