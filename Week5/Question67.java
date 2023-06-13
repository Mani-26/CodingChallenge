import java.util.*;
public class Question67 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for(int i=0;i<a.length();i++){
        int b = (int) a.charAt(i);
        System.out.print(b+" ");
        }
    }
}