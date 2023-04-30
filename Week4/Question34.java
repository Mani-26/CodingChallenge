import java.util.*;
public class Question34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int count=0;
        for(int i=1; i<=a; i++){
        if(i%2!=0 && i%3!=0 && i%5!=0)
            count++;
        }
        System.out.println(count);
    }
}
