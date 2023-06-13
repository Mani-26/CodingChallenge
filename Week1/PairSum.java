package CodingChallenge.Week1;

import java.util.*;
public class PairSum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        List<String> l1 = new ArrayList<String>();
        l1.add(a);
        while (!(a.equals("-1"))) {
            a=sc.nextLine();
            l1.add(a);
        }
        sc.close();
        int c=l1.lastIndexOf("-1");
        if(c<=1)
            System.out.println("Invalid Input");
        else{
            if (c%2==0) {
             for (int i = 0; i < c; i+=2) {
             System.out.println(Integer.parseInt(l1.get(i))+Integer.parseInt(l1.get(i+1)));   
            }   
            }
            else{
                for (int i = 0; i < c-1; i+=2) {
             System.out.println(Integer.parseInt(l1.get(i))+Integer.parseInt(l1.get(i+1)));   
            }
            }
        }
    }
}