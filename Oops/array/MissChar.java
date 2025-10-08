class MissChar
{
	public static void main(String [] args)
	{
		char [] a= new char[]{'a','d','g','f','l'};
		
		for(char x='a';x<='z';x++)
		{
			boolean found=false;
			for(int y=0;y<=a.length-1;y++)
			{
				if(x==a[y])
				{
				found=true;
				break;
				}
			
					
			}
			if(found==false)
			{
				System.out.println(x);
			}
			
		}
	}
}

/*

b
c
e
h
i
j
k
m
n
o
p
q
r
s
t
u
v
w
x
y
z

*/
