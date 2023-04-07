import java.util.*;
public class CalcSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==-1)
            System.out.println("invalid input");
        while (n!=-1) {
            System.out.println(n*n);
            n=sc.nextInt();
        }
        sc.close();
    }
}