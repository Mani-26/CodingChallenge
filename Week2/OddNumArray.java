package Week2;
import java.util.*;
public class OddNumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        n=n.trim();
        sc.close();
        String a[] = n.split(",");
        int count=0;
        int b[] = new int[n.length()];
        for (int i=0;i<a.length;i++){
            b[i] = Integer.parseInt(a[i]);
        }
        for(int i=0;i<a.length;i++){
            if((b[i]%2!=0)&&(count==0)){
                System.out.print(b[i]);
                count++;
            }
            else if((b[i]%2!=0)&&(count!=0)){
                 System.out.print(","+b[i]);
                 count++;
            }
        }
    }
    }