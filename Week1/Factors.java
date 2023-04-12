import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        for(int i=1;i<a;i++){
            if(i==1)
                System.out.print(i);
            else{
                if(a%i==0)
                    System.out.print(","+i);
            }
        }
    }
}
