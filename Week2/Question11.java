package Week2;
import java.util.*;
public class Question11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[]=sc.nextLine().toUpperCase().split(" ");
        System.out.println(str[0].charAt(0)+"."+str[1].charAt(0));
        sc.close();
    }
}