package Week2;
import java.util.*;
public class Question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int exp=sc.nextInt();
        sc.close();
        System.out.println((int)Math.pow(base,exp));
    }
}