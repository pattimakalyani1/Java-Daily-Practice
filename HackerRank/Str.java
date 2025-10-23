import java.io.*;
import java.util.*;

public class Str {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum=0;
        sum=A.length()+B.length();
        System.out.println(sum);
        char c[]=A.toCharArray();
        char d[]=B.toCharArray();
       if(c[0]>d[0])
       {
        System.out.println("Yes");
        
       }
       else
        System.out.println("No");
        String s="";
        for(int x=0;x<=c.length-1;x++)
        {
            if(x==0)
            {
                s=s+((char)(c[x]-32));
            }
            else
            s=s+c[x];
        }
        s=s+" ";
        for(int x=0;x<=d.length-1;x++)
        {
            if(x==0)
            {
                s=s+((char)(d[x]-32));
            }
            else
            s=s+d[x];
        }
        System.out.println(s);
        
        
    
    }
}

/*


Input (stdin)
hello
java

Expected Output
9
No
Hello Java


*/

