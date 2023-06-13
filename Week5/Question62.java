import java.util.*;
public class Question62 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char str[]=sc.nextLine().toCharArray();
        sc.close();
        for (char s : str) {
            if(Character.isUpperCase(s))
                System.out.print(s);
        }
    }
}
