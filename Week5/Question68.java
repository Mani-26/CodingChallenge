import java.util.*;
public class Question68{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a  = sc.nextLine();
        sc.close();
        char b[] = a.toCharArray();
        int sum =0;
        for(int i=0;i<a.length();i++){
            sum = sum + ((int)b[i]*i);
        }
        System.out.print(sum);
    }
}