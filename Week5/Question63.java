import java.util.*;
public class Question63 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=sc.next().charAt(0);
        int b=sc.nextInt();
        sc.close();
        switch (c) {
            case 'x':
                System.out.println(a*b);
                break;
            case '+':
            System.out.println(a+b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '%':
            System.out.println(a%b);
            break;
            default:
                break;
        }
    }
}
