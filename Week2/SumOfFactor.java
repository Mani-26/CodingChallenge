package Week2;
import java.util.*;
public class SumOfFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String b[]=(sc.nextLine().split(","));
        sc.close();
        int arr[]=new int[b.length];
        int sum=0,count=0,count1=1;
        for (int i = 0; i < b.length; i++) {
            arr[i]=Integer.parseInt(b[i]);
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) 
                    sum += j;
            }
            System.out.println("s="+sum);
                if (sum==arr[i] && sum>0) {
                    count1++;
                    if (count==0) {
                        System.out.print(arr[i]);
                        count++;
                    }
                    else{
                        System.out.print(","+arr[i]);
                    }
                }
                sum=0;
        }            
        if (count1==1) {
            System.out.println("-1");
        }
    }
}
