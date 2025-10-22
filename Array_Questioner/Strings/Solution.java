  import java.util.Scanner;

public class solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        int count=0;
        a=a.toLowerCase();
        b=b.toLowerCase();
       // boolean e[]=new boolean[a.length()];
        if(a.length()==b.length())
        {
            char c[]=a.toCharArray();
            char d[]=b.toCharArray();
            int x,y;
            for(x=0;x<=c.length-1;x++)
            {
                int min=x;
                for(y=x+1;y<=c.length-1;y++)
                {
                    if(c[min]>c[y])
                    {
                        min=y;
                    }
                    char temp=c[min];
                    c[min]=c[x];
                    c[x]=temp;
                }
            }
		for(char temp1:c)
			System.out.print(temp1+" ");
             for(x=0;x<=d.length-1;x++)
            {
                int min=x;
                for(y=x+1;y<=d.length-1;y++)
                {
                    if(d[min]>d[y])
                    {
                        min=y;
                    }
                    char temp=d[min];
                    d[min]=d[x];
                    d[x]=temp;
                }
            }
		System.out.println();
		for(char temp1:d)
			System.out.print(temp1+" ");
            for(x=0;x<=c.length-1;x++)
            {  
                    if(c[x]!=d[x])
                    {
                        count++;     
                    }
                
            }
            if(count==0)
                return true;
        }
        return false;
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
