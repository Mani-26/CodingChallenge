import java.util.*;
public class Question89{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        for(int i=1;i<=a;i++){
            for(int j =1;j<=a;j++){
             System.out.print(j);   
            }
        }
    }
}