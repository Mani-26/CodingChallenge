package Week2;
import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Mark = sc.nextFloat();
        float MaxMark = sc.nextFloat();
        float Weighting = sc.nextFloat();
        float score = ((MaxMark/Mark)*Weighting);
        System.out.printf("%.1f",score);
    }
}