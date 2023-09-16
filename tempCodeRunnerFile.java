import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        String compressedStr = "";
        int count = 1;
        boolean isFirstChar = true;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                if (isFirstChar) {
                    isFirstChar = false;
                    compressedStr += str.charAt(i - 1);
                } else {
                    compressedStr += String.valueOf(count) + str.charAt(i - 1);
                }
                count = 1;
            }
        }
        if (count == 1) {
            compressedStr += str.charAt(str.length() - 1);
        } else {
            compressedStr += String.valueOf(count) + str.charAt(str.length() - 1);
        }

        System.out.println("Compressed string: " + compressedStr);
    }
}
