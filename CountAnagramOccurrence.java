// import java.util.Arrays;
import java.util.Scanner;
/*
Enter the text: forxorfxdofr
Enter the pattern: for
Count of anagram occurrences: 3
 */
public class CountAnagramOccurrence {
    public int countAnagramOccurrences(String text, String pattern) {
        int[] patternFreq = new int[26];
        int[] windowFreq = new int[26];

        for (char c : pattern.toCharArray()) {
            patternFreq[c - 'a']++;
        }

        int start = 0;
        int end = 0;
        int counter = 0;
        int result = 0;

        while (end < text.length()) {
            char endChar = text.charAt(end);
            windowFreq[endChar - 'a']++;
            if (windowFreq[endChar - 'a'] <= patternFreq[endChar - 'a']) {
                counter++;
            }

            if (end - start + 1 == pattern.length()) {
                if (counter == pattern.length()) {
                    result++;
                }

                char startChar = text.charAt(start);
                windowFreq[startChar - 'a']--;
                if (windowFreq[startChar - 'a'] < patternFreq[startChar - 'a']) {
                    counter--;
                }

                start++;
            }

            end++;
        }

        return result;
    }
    public static void main(String[] args) {
        CountAnagramOccurrence solution = new CountAnagramOccurrence();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        System.out.print("Enter the pattern: ");
        String pattern = scanner.nextLine();

        scanner.close();

        int count = solution.countAnagramOccurrences(text, pattern);
        System.out.println("Count of anagram occurrences: " + count);
    
    }
   
}
