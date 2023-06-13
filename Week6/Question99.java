import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int b = 0;
        int c = 0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                b = a[i]*3;
                c = c+b;
            }
           else {
                b = a[i]*5;
                c = c+b;
            }
        }
        System.out.print(c);
    }
}