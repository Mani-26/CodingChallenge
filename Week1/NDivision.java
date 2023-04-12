import java.util.*;
public class NDivision{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        for(int i=a;i<=b-7;i++){
            if(i%7==0 && i%5!=0)
                System.out.print(i+",");
        }
        for(int i=b-7;i<=b;i++){
            if(i%7==0 && i%5!=0)
                System.out.print(i);
        }
    }
}