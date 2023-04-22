import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b[] = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
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