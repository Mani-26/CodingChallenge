import java.util.*;
public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        char d = scanner.next().charAt(0);
        if (d == 'R')
            Arrays.sort(a);
        else if (d == 'L') {
            Arrays.sort(a);
            int i=0;
            while(i < n/2){
                int temp = a[i];
                a[i] = a[n - i - 1];
                a[n - i - 1] = temp;
                i++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}