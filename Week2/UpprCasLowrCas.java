package Week2;
import java.util.*;
public class UpprCasLowrCas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int upper = 0,lower = 0;
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (Character.isUpperCase(c)) {
                    upper++;
                }
                else if(Character.isLowerCase(c)){
                    lower++;
                }
            }
        }
        System.out.println("UPPER CASE "+upper);
        System.out.println("LOWER CASE "+lower);                
    }
}