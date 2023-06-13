
import java.util.*;
public class Question61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        sc.close();
        int count=0;
        while(i>0){
            int a=i%10;
            if(a==6 || a==8)
                count++;
            i/=10;
        }
        if (count==1) 
            System.out.println("Lucky");
        else
            System.out.println("Not Lucky");
    }
}