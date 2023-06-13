import java.util.Scanner;
public class Question30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b[] = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < a; i++) {
            if (b[i] > 0) {
                b[i] = -b[i];
            } else {
                b[i] = Math.abs(b[i]);
            }
            System.out.print(b[i] + " ");
        }
    }
}