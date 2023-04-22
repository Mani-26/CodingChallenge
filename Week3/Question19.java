import java.util.*;
public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        boolean sheep[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            sheep[i] = sc.nextBoolean();
        }
        for (int i = 0; i < n; i++) {
            boolean a=sheep[i];
            if (a)
                count++;
        }
        System.out.println(count);
    }
}