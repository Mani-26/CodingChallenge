import java.util.Scanner;
public class Question95{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int m = n*n;
        int p=0;
        while(m>0){
            p=p+(m%10);
            m=m/10;
        }
        System.out.print(p);
    }
}