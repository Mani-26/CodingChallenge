import java.util.Scanner;
public class ComplexEquation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        str=str.trim();
        String arr[]= str.split(",");
        int arr1[]=new int[arr.length];
        int H=30,C=50,Q,D=0;
        for(int i=0;i<arr.length;i++){
            arr1[i]=Integer.valueOf(arr[i]);
        }
        for(int i=0;i<arr1.length;i++){
            if (i==0) {
                D=arr1[i];
                Q=(int)Math.sqrt((2*C*D)/H);
                System.out.print(Q);
            }
            else{
                D=arr1[i];
                Q=(int)Math.sqrt((2*C*D)/H);
                System.out.print(","+Q);
            }
        }
    }
}