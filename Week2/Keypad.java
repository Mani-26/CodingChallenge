package Week2;
import java.util.*;
public class Keypad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        int b = Integer.parseInt(str);
        int n=str.length();
        int a=0;
        for(int i=n-1;i>=0;i--){
            int p=(int)Math.pow(10,i);
            a=b/p;
            b=b%p;
            if (a==1) {
                break;
            }
            else if (a==2) {
                
            } 
            else if(a==3){
                
            }
            else if(a==4){

            }
            else if(a==5){

            }
            else if(a==6){

            }
            else if(a==7){

            }
            else if(a==8){

            }
            else if(a==9){

            }
            else if(a==0){

            }
    }
    }

    private static String str(int i) {
        return null;
    }
}
