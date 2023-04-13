package Week2;
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String c=sc.nextLine();
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int out=maths(c,a,b);
        System.out.println(out);
    }
    public static int maths(String c, int a, int b) {
        int res=0;
        if(c.equals("+"))
            res=a+b;
        else if(c.equals("-"))
            res= a-b;
        else if(c.equals("/"))
            res=a/b;
        else if(c.equals("*"))
            res=a*b;
        return res;
    }
}
