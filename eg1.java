import java.util.Scanner;

public class eg1 {

    public static String translate(String digits) {
        if (digits == null || digits.isEmpty()) {
            return "";
        }

        String[] mapping = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        StringBuilder resultBuilder = new StringBuilder();
        int index = 0;

        while (index < digits.length()) {
            char currentDigit = digits.charAt(index);
            int count = 1;

            while (index + count < digits.length() && digits.charAt(index + count) == currentDigit) {
                count++;
            }

            int digit = Character.getNumericValue(currentDigit);
            String letters = mapping[digit];
            int maxIndex = letters.length() - 1;

            if (maxIndex >= count - 1) {
                resultBuilder.append(Character.toUpperCase(letters.charAt(count - 1)));
            } else {
                resultBuilder.append(Character.toUpperCase(letters.charAt(maxIndex)));
            }

            index += count;
        }

        return resultBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string of digits: ");
        String digits = scanner.nextLine();
        scanner.close();
        System.out.println("The corresponding text is: " + translate(digits.toLowerCase()));
    }
}
