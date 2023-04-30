import java.util.*;
public class Question33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int a=sc.nextInt();
        int s=sc.nextInt();
        sc.close();
        if((s<=2 && k!=0 )|| a<2)
            System.out.println(0);
        else{
            double k1=k,a1=a,s1=s;
            double b=Math.ceil((k1+a1)/s1);
            System.out.println((int)b);
        }
    }
}