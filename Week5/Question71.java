import java.util.*;
public class Question71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <=b; i++) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                System.out.print("Dope-");
            }
            else if(i==b && i%3!=0){
                System.out.println(i);
            }
            else if(i==b && i%3==0){
                System.out.println("Dope");
            }
            else{
                System.out.print(i + "-");
            }
        }
    }    
}