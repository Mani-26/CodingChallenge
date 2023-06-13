import java.util.*;
public class Question16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sqrt = (int)Math.sqrt(n);
        int m;
        if (n == sqrt * sqrt)
            m = n;
        else {
            int lowerSquare = sqrt * sqrt;
            int upperSquare = (sqrt + 1) * (sqrt + 1);
            m = (n - lowerSquare < upperSquare - n) ? lowerSquare : upperSquare;
        }
        System.out.println(m);
    }
}