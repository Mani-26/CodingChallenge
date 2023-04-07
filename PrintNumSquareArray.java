import java.util.Scanner;

public class PrintNumSquareArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=i+1;
            arr2[i]=(i+1)*(i+1);
        }
        for(int i=0;i<n-1;i++){
            System.out.print(arr1[i]+": "+arr2[i]+", ");
        }
        for(int i=n-1;i<n;i++){
            System.out.print(arr1[i]+": "+arr2[i]);
        }
    }
}
