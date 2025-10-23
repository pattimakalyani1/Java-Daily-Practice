import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s=s.trim();
        if(s.length()==0)
            System.out.println("0");
        else 
        {
        String s1[]=s.split("[ ,'?._@!]+");
        System.out.println(s1.length);
        for(int x=0;x<s1.length;x++)
        {
            System.out.println(s1[x]);
        }
        }
        scan.close();
    }
}



/*

Sample Input

He is a very very good boy, isn't he?
Sample Output

10
He
is
a
very
very
good
boy
isn
t
he

*/
