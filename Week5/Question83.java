import java.util.*;
public class Question83{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        int c[] = new int[a.length];
        for(int i=0;i<a.length;i++){
            c[i] = Integer.parseInt(a[i]);
        }
        int sum = 0;
        int mul = 1;
        int i=0;
        sum = (c[i]*c[i+2])+c[i+1];
        mul = c[i+2];
        System.out.print(sum+" "+mul);
    }
}