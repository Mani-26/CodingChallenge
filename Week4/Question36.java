import java.util.*;
public class Question36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int count=0;
        for(int i=0;i<=n;i++){
            for(int j=i;j<=n;j++){
                count+=i+j;
            }
        }
        System.out.println(count);
    }
}
