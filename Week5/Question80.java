import java.util.*;
public class Question80{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        long a = sc.nextInt();
        long b = sc.nextInt();
        sc.close();
        long c = 0;
        System.out.println(a);
        System.out.println(b);
        for(int i = 0;i<t-2;i++){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}