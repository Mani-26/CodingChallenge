package CodingChallenge.Week6;
import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 1,m=0;
        for(int i=2;i<=n;i++){
                s = s+2;
                m+=s;
        }
        if(s%10==0){
          System.out.print(m/10);
        }
        else{
            System.out.print((m/10)+1);
        }
    }
}