class Str1212
{
	public static void main(String [] args)
	{
		String s="hello1 all2 good3 mornin4g5";
		String s1[]=s.split(" ");
		int k=0;
		for(int x=0;x<=s1.length-1;x++)
		{
			String word=s1[x];
			char c1[]=word.toCharArray();
			for(int z=0;z<=c1.length-1;z++)
			{				
				if(c1[z]>='0' && c1[z]<='9')
				{
	
					int num=(char)(c1[z]-'0');
					k=k*10+num;
				}
			}
		}
		System.out.println(k);
		int rev=0,l=k;
		while(k!=0)
		{
			rev=rev*10+(k%10);
			k/=10;
		}
		System.out.println(l==rev?"palindrome":"not palindrome");
			
	}
}




class Str121
{
	public static void main(String [] args)
	{
		String s="hello all good morning everyone";
		String s1[]=s.split(" ");
		String s2="";
		String s3="";
		for(int x=0;x<=s1.length-1;x++)
		{
			String word1=s1[x];
			if((word1.length()%2!=0))
			{
				s2=s2+s1[x]+" ";
			}
			else
			{	s3=" ";
				String word=s1[x];//good
				char c1[]=word.toCharArray();//g o o d
				for(int y=0;y<=word.length()-1;y++)
				{
					char temp=c1[y];
					c1[y]=c1[y+1];
					c1[y+1]=temp;
					y++;
				}
				for(char temp:c1)
					s3=s3+temp;
				s2=s2+s3+" ";
			}
		}
		System.out.println(s2);
	}
}
	

//hello all  ogdo morning  vereoyen
	

class Str123
{
	public static void main(String [] args)
	{
		String s="{[()]}";
		boolean b=true;
		String s1="";
		if(s.length()%2==0)
		{
			char c[]=s.toCharArray();
			int n=c.length;	
			int m=n/2;
			char c1[]=new char[m];
			char c2[]=new char[m];
			for(int x=0;x<=m;x++)
			{
				c1[x]=c[x];
			}
			int x=0;
			for(int y=m+1;y<n;y++)
			{
				c2[x]=c[y];
				x++;
			}
			for(char temp:c1)
				System.out.print(temp);
			System.out.println();

			for(char temp2:c2)
				s1=s1+temp2;
			
			StringBuffer sb=new StringBuffer(s1);
			sb.reverse();
			String s3=sb.toString();
			System.out.println(s3);
			char c3[]=s3.toCharArray();
			for(x=0;x<c1.length-1;x++)//0//1//2
			{
				int l=(int)(c1[x]);//123//91
				int k=(int)(c3[x]);//125//93
				
				//System.out.println(l);
				System.out.println(k);
				/*if(((k-l)!=2)||(k-l)!=1||(k-l)!=0)
				{
					b=false;
				}*/
					
			}	
		}
		//System.out.println(b?"valid":"not valid");
		
	}
}	
	


class Str12
{
	public static void main(String [] args)
	{
		String s="{[()]}";
		while(s.contains("{}")||s.contains("()") ||s.contains("[]"))
		{
			s=s.replace("{}","");
			s=s.replace("()","");
			s=s.replace("[]","");
		}
		if(s.isEmpty())
			System.out.println("valid");
		else
			System.out.println("not valid");
	}
}

//valid

		
					
					
				
			





















					
		