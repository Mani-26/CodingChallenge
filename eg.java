import java.util.*;

public class eg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String b[]=(sc.nextLine().split(","));
        sc.close();
        int arr[]=new int[b.length];
        for (int i = 0; i < b.length; i++) {
            arr[i]=Integer.parseInt(b[i]);
            System.out.println(arr[i]);
        }
        int sum = 0;
        boolean isSumPresent = false;

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    sum += j;
                }
            }
            if (Arrays.binarySearch(arr, sum) >= 0) {
                isSumPresent = true;
            }
        }
        if (isSumPresent) {
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("-1");
        }
    }
}