package Week2;
import java.util.*;
public class Anagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        str1=str1.toLowerCase();
        String str2 = sc.nextLine();
        str2=str2.toLowerCase();
        sc.close();
        int a = str1.length();
        int b = str2.length();
        if(a==b){
            String result=anagram(str1, str2);
            System.out.println(result);
        }
        else
            System.out.println("False");
     }
     public static String anagram(String str1, String str2) {
        char c1[] = str1.toCharArray();
        char c2[] = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2))
            return "True";
        else 
            return "False";
     }
}