import java.util.*;
public class Question35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the chessboard: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Maximum number of queens: 0");
        } else {
            int maxQueens = n * (n - 1);
            if (n % 2 == 1) {
                maxQueens++;
            }
            System.out.println("Maximum number of queens: " + maxQueens);
        }
    }
}


/*
 * 4 6
 * 5 12
 * 33 992
 * 20 342
 * 6 20
 */