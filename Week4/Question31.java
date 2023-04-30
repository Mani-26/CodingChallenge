import java.util.*;
public class Question31{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        sc.close();
        int c=0;
        for (int i = 1; b!=a; i++) {
            c=i;
            b+=a;
            b/=2;
        }
        System.out.println(c);
    }
}