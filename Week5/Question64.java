import java.util.*;
public class Question64 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char str[]=sc.nextLine().toCharArray();
        sc.close();
        int max=0;
        for (char c : str) {
            int a=(int)c;
            if(a>max)
                max=a;
        }
        System.out.println(max);
    }
}
