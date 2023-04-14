package Week2;
import java.util.*;
public class Keypad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        int b = Integer.parseInt(str);
        int n=str.length();
        int a=0,count=0,num=-1;
        for(int i=n-1;i>=0;i--){
            int p=(int)Math.pow(10,i);
            a=b/p;
            b=b%p;
            switch(a){
                case 1:
                    break;
                case 2:{
                    String s="abc";
                    count++;
                    System.out.println(s.charAt(count));
                    break;
                }
            }
    }
    }
}
