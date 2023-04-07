import java.util.*;
public class PerfectSquare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int count=0;
        for (int i = a+1; i <= b; i++) {
            int c=(int)Math.sqrt(i);
            if(c*c==i){
                count++;
                if (count==1) {
                    System.out.print(i);
                }
                else
                    System.out.print(","+i);
            }
        }
    }
}