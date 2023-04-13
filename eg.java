import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class eg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of data entries
        System.out.print("Enter the number of data entries: ");
        int n = scanner.nextInt();

        // Create the arrays to hold the data
        String[] names = new String[n];
        int[] ages = new int[n];
        int[] heights = new int[n];

        // Read in the data from the console
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter data entry #%d: ", i + 1);
            String[] input = scanner.next().split(",");
            names[i] = input[0];
            ages[i] = Integer.parseInt(input[1]);
            heights[i] = Integer.parseInt(input[2]);
        }
        scanner.close();
        // Create a custom comparator to sort based on name, age, and height
        Comparator<String[]> customComparator = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int nameCompare = o1[0].compareTo(o2[0]);
                if (nameCompare != 0) {
                    return nameCompare;
                } else {
                    int ageCompare = Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
                    if (ageCompare != 0) {
                        return ageCompare;
                    } else {
                        return Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
                    }
                }
            }
        };

        // Create a temporary array of arrays to hold the data
        String[][] data = new String[n][3];
        for (int i = 0; i < n; i++) {
            data[i][0] = names[i];
            data[i][1] = Integer.toString(ages[i]);
            data[i][2] = Integer.toString(heights[i]);
        }

        // Sort the data using the custom comparator
        Arrays.sort(data, customComparator);

        // Print out the sorted data
        for (String[] entry : data) {
            System.out.printf("%s %s %s\n", entry[0], entry[1], entry[2]);
        }
    }
}
