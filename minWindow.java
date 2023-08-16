import java.util.HashMap;
import java.util.Map;

class minWindow {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }

        Map<Character, Integer> tFreq = new HashMap<>();
        Map<Character, Integer> windowFreq = new HashMap<>();

        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }

        int start = 0;
        int end = 0;
        int counter = 0;
        int minWindowLength = Integer.MAX_VALUE;
        int minWindowStart = 0;

        while (end < s.length()) {
            char endChar = s.charAt(end);
            windowFreq.put(endChar, windowFreq.getOrDefault(endChar, 0) + 1);
            if (tFreq.containsKey(endChar) && windowFreq.get(endChar) <= tFreq.get(endChar)) {
                counter++;
            }

            while (counter == t.length()) {
                if (end - start + 1 < minWindowLength) {
                    minWindowLength = end - start + 1;
                    minWindowStart = start;
                }

                char startChar = s.charAt(start);
                if (tFreq.containsKey(startChar) && windowFreq.get(startChar) <= tFreq.get(startChar)) {
                    counter--;
                }
                windowFreq.put(startChar, windowFreq.get(startChar) - 1);
                start++;
            }

            end++;
        }

        if (minWindowLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(minWindowStart, minWindowStart + minWindowLength);
    }

    public static void main(String[] args) {
        minWindow solution = new minWindow();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String minWindow = solution.minWindow(s, t);
        System.out.println("Minimum window substring: " + minWindow); // Output: "BANC"
    }
}
