import java.util.*;
public class SumTwoNumsRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.println(add(a,b));
    }
    public static int add(int a,int b) {
        if(b==0)
            return a;
        else
            return a+b;
    }
}
