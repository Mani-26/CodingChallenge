package Week2;
import java.util.*;
public class Question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        int dis=sc.nextInt();
        double cost=price*dis/100.0;
        cost=price-cost;
        sc.close();
        System.out.printf("%.1f",cost);
    }
}