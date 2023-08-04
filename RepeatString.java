import java.util.*;
public class RepeatString {
  public static String repeatString(String str, int n) {
    // f n is 0, return an empty string.
    if (n == 0) {
      return "";
    }
    // return the string concatenated with the result of calling the function recursively with n-1.
    return str + repeatString(str, n - 1);
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the string to be repeated: ");
    String str = scn.nextLine();
    System.out.print("Enter the number of times to repeat the string: ");
    int n = scn.nextInt();
    String repeatedString = repeatString(str, n);
    System.out.println(repeatedString+" ");
  }
}
