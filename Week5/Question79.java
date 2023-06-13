import java.util.*;
public class Question79{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='A'){
                System.out.print("AA");
            }
            else if(a.charAt(i)=='T'){
                System.out.print("TTT");
            }
            else if(a.charAt(i)=='G'){
                System.out.print("");
            }
            else if(a.charAt(i)=='C'){
                System.out.print("C");
            }
        }
    }
}