import java.util.*;
public class FactorialL1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int inp=sc.nextInt();
        sc.close();
        if (inp%2==0) 
            System.out.println("The given number is EVEN, so the factorial value of "+inp+" is "+fact(inp));
        else
            if(Prime(inp)!=0)
                System.out.println("The given number is ODD but not a prime number.");
            else
                System.out.println("The given number is ODD and also a prime number.");
    }
    public static int fact(int inp){
        if(inp!=0)
            return inp*fact(inp-1);
        else
            return 1;
    }
    public static int Prime(int inp) {
        int count=0;
        for(int i=2;i<inp;i++){
            if(inp%i==0){
                count++;
            }
        }
        return (count);
    }
}