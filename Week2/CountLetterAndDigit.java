package Week2;
import java.util.*;
public class CountLetterAndDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int let = 0,num = 0;
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if (Character.isAlphabetic(c)) {
                let++;
            }
            else if(c>='0' && c<='9')
                num++;
        }
        System.out.println("LETTERS "+let);
        System.out.println("DIGITS "+num);
    }
}
