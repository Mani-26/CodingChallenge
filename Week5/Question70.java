import java.util.*;
public class Question70{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a*120 > b+c)
            System.out.print("True");
        else
            System.out.print("False");
    }
}