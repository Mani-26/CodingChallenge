package Week2;
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        double b=0;
        for (int i = 0; i < n; i++) {
            a =sc.nextInt();
            b+=a;
        }
        sc.close();
        b/=n;
        System.out.println(b);
    }
}
