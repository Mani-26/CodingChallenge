package Week2;
import java.util.*;;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n-1;
        sc.close();
        for (int i = 1; i <= 2*n; i+=2) {
            for (int k = m; k >0; k--) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            m--;
            System.out.println();
        }m=1;
        for (int i = 2*(n-1)-1; i >= 1; i-=2) {
            for (int k = m; k >0; k--) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            m++;
            System.out.println();
        }
    }
}
