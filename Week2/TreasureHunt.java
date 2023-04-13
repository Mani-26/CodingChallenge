package Week2;
import java.util.*;
public class TreasureHunt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=0,c=1;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        if(n%2==1){
            for(int i=0;i<n;i++){
                if(i==1)
                    b+=arr[i];
                
                else 
                    continue;
            }
        }
        else{
            while (c<n) {
                b+=arr[c];
                c+=3;
            }
        }
        System.out.println(b);
    }
}
