import java.util.*;
public class Question65 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[]=new String[16];
        for (int i = 0; i < 16; i++) {
            str[i]=sc.nextLine();
        }
        sc.close();
        for (int i = 0; i < 16; i++) {
            System.out.println(str[i].replace('0', ' ').replace('1', '#'));
        }
    }
}
