import java.util.*;
public class Question92 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        for (int i = 1; i <=a ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("#");
            }
            for (int k = 0; k < b; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("#");
            }
            if(i!=a){
                for (int k = 0; k <= b; k++) {
                    System.out.println(" ");
                }
            }
        }
    }
}