import java.util.Scanner;
public class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();

        String outputStr = consecutiveCharacterCount(inputStr);
        System.out.println("Output: " + outputStr);
    }
    public static String consecutiveCharacterCount(String inputStr) {
        if (inputStr.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        char currentChar = inputStr.charAt(0);
        int count = 1;

        for (int i = 1; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(currentChar).append(count);
                currentChar = inputStr.charAt(i);
                count = 1;
            }
        }
        result.append(currentChar).append(count);
        return result.toString();
    }
}
