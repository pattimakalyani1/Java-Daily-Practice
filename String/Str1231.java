class Str123
{
	public static void main(String [] args)
	{
		String s="hello";
		String s2=new String ("hai");
		String s3=new String("hello");
		String s4=new String("hai");
		s2=s2.intern();
		s3=s3.intern();
		s4=s4.intern();
		System.out.println("s :"+System.identityHashCode(s));
		System.out.println("s3 :"+System.identityHashCode(s3));
		System.out.println("======================================");
		System.out.println("s2 :"+System.identityHashCode(s2));
		System.out.println("s4 :"+System.identityHashCode(s4));

	}
}

/*


s :798154996
s3 :798154996
======================================
s2 :868693306
s4 :868693306

*/



class Str1
{
	public static void main(String [] args)
	{
		String s="i am good developer and expert";
		String s1[]=s.split(" ");
		String s2="";
		for(int x=0;x<=s1.length-1;x++)
		{
			if(s1[x].length()==1)
			{
				s2=s2+s1[x]+" ";
			}
			else
			{
				String s3="";
				String word=s1[x];
				char c1[]=word.toCharArray();
				char temp=c1[0];
				c1[0]=c1[c1.length-1];
				c1[c1.length-1]=temp;
				for(int y=0;y<=c1.length-1;y++)
					s3=s3+c1[y];
				s2=s2+s3+" ";
			}	
		}
		System.out.println(s2);
	}
}
			
	
//i ma doog reveloped dna txpere	



class Str2
{
	public static void main(String [] args)
	{
		String s="i am good deve@loper!, and expert";
		String s1[]=s.split(" ");
		String s2="";
		for(int x=0;x<=s1.length-1;x++)
		{
			if(s1[x].length()==1)
			{
				s2=s2+s1[x]+" ";
			}
			else
			{
				String s3="";
				String word=s1[x];
				char c1[]=word.toCharArray();
				int k=0;
				for(int z=c1.length-1;z>=0;z--)
				{
				if(Character.isLetter(c1[z]) ||Character.isDigit(c1[z])	)
				{
					k=z;
					//System.out.println(k);
					break;
				}
				}
				char temp=c1[0];
				c1[0]=c1[k];
				c1[k]=temp;
				
				for(int y=0;y<=c1.length-1;y++)
					s3=s3+c1[y];
				s2=s2+s3+" ";
			}	
		}
		System.out.println(s2);
	}
}
	
//i ma doog reve@loped!, dna txpere	
				
	



class Str3
{
	public static void main(String [] args)
	{
		String s="i am good &deve@loper!, and expert";
		String s1[]=s.split(" ");
		String s2="";
		for(int x=0;x<=s1.length-1;x++)
		{
			if(s1[x].length()==1)
			{
				s2=s2+s1[x]+" ";
			}
			else
			{
				String s3="";
				String word=s1[x];
				char c1[]=word.toCharArray();
				int l=0;
				for(int w=0;w<=c1.length-1;w++)
				{
				if(Character.isLetter(c1[w]) ||Character.isDigit(c1[w])	)
				{
					l=w;
					//System.out.println(k);
					break;
				}
				}

				int k=0;
				for(int z=c1.length-1;z>=0;z--)
				{
				if(Character.isLetter(c1[z]) ||Character.isDigit(c1[z])	)
				{
					k=z;
					//System.out.println(k);
					break;
				}
				}
				char temp=c1[l];
				c1[l]=c1[k];
				c1[k]=temp;
				
				for(int y=0;y<=c1.length-1;y++)
					s3=s3+c1[y];
				s2=s2+s3+" ";
			}	
		}
		System.out.println(s2);
	}
}
				
				




















		
