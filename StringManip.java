import java.util.HashMap;

public class StringManip {

    public static String minwindow(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() < s2.length()) {
            return "";
        }

        HashMap<Character, Integer> charfreq = new HashMap<>();
        for (char c : s2.toCharArray()) {
            charfreq.put(c, charfreq.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> windowcount = new HashMap<>();
        int start = 0, matched = 0, minLength = Integer.MAX_VALUE;
        int minStart = 0;

        for (int end = 0; end < s1.length(); end++) {
            char endChar = s1.charAt(end);
            windowcount.put(endChar, windowcount.getOrDefault(endChar, 0) + 1);

            if (charfreq.containsKey(endChar) &&
                windowcount.get(endChar).equals(charfreq.get(endChar))) {
                matched++;
            }

            while (matched == charfreq.size()) {
                if (end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    minStart = start;
                }

                char startChar = s1.charAt(start);
                windowcount.put(startChar, windowcount.get(startChar) - 1);

                if (charfreq.containsKey(startChar) &&
                    windowcount.get(startChar) < charfreq.get(startChar)) {
                    matched--;
                }
                start++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s1.substring(minStart, minStart + minLength);
    }

    public static void main(String[] args) {
        String s1 = "ADOBECODEBANC";
        String s2 = "ABC";
        System.out.println("Smallest Substring: " + minwindow(s1, s2));
    }
}
