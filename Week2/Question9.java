package Week2;
import java.util.*;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        sc.close();
        double billpay = 0;
        if(inp<100){
            billpay = inp*1.20f;
            System.out.printf("%.1f",billpay);
        }
        else if((inp>100)&&(inp<=300)){
            billpay = 100*1.20f+(inp-100)*2;
           System.out.printf("%.1f",billpay);
        }
        else if(inp>300){
            billpay = 100*1.20 + 200*2 + (inp-300)*3;
            System.out.printf("%.1f",billpay);
        }
    }
}