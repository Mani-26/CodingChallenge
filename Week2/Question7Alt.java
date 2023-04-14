package Week2;
import java.util.*;
public class Question7Alt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int b=base;
        int exp=sc.nextInt();
        sc.close();
        for (int i = 1; i < exp; i++) {
            base*=b;
        }
        System.out.println(base);
    }
}
