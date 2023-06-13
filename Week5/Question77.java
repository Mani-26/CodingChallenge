import java.util.Scanner;
public class Question77{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String a[] = new String[n];
        int count = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextLine();
        }
        sc.close();
        for(int i=0;i<n;i++){
            int l = a[i].length();
                int start = 0;
                int end = l-1;
            while(start<end){
                if(a[i].charAt(start)!=a[i].charAt(end)){
                    count += 1;
                }
                start++;
                end--;
            }
            if(count==0){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}