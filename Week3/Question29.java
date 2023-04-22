import java.util.*;
public class Question29{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int m=sc.nextInt();
        int s=sc.nextInt();
       System.out.println((h*3600000)+(m*60000)+(s*1000));
    }
}