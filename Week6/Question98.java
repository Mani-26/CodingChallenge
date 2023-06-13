import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 0;
        int k = 0;
        int j = 0;
        for(int i=1;i<=n;i++){
            l = l+i;
        }
        for(int i=1;i<=n;i++){
            int m = i*i;
            k = k+m;
        }
        for(int i=1;i<=n;i++){
            int m = i*i*i;
            j = j+m;
        }
        System.out.print(l+k+j);
    }
}