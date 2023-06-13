import java.util.*;
public class Question82{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = 0;
        System.out.println(a);
        System.out.println(b);
        for(int i = 0;i<t-2;i++){
            sum = a+b;
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }
}