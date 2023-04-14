package Week2;
import java.util.*;
public class Question12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of matches played");
        int matchesPlayed = sc.nextInt();
        System.out.println("enter the number innings batted");
        int inningsBatted = sc.nextInt();
        System.out.println("enter number of times notout");
        int notOuts = sc.nextInt();
        System.out.println("enter runs scored");
        int runsScored = sc.nextInt();
        sc.close();
        double battingAverage = (double) runsScored / (inningsBatted - notOuts);
        System.out.printf("batting average=%.1f", battingAverage);
        if (matchesPlayed==0){}
    }
}