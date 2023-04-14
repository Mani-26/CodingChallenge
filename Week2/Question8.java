package Week2;
import java.util.*;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        for (int i = (str.length()-1); i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}