package Week2;
import java.util.*;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int S1=0,S2=0,S3=0;
        sc.close();
        for (int i = 1; i <= N; i++) {
            if (i%X==0) 
                S1+=i;
            if(i%Y==0)
                S2+=i;
            if ((i%X==0) && (i%Y==0)) 
                S3+=i;
        }
        System.out.println(S1+S2-S3);
    }
}
