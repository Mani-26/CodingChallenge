import java.util.*;
public class BankTransactionL2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        sc.close();
        int balance=0;
        balance+=Integer.parseInt(arr[1]);
        while(true){
        if(arr[0].equals("W")){
            str=sc.nextLine();
            System.out.println(balance);
        }           
        }
    }
}
