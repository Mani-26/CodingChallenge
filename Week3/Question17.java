import java.util.*;
public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        sc.close();
        String str2 = str1.replaceAll(" ", "");
        System.out.println(str2);
    }
}