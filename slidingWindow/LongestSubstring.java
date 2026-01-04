package slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        Set<Character> windowSet = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // If character already exists, remove from left
            while (windowSet.contains(s.charAt(right))) {
                windowSet.remove(s.charAt(left));
                left++;
            }

            windowSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Longest substring length: "
                + lengthOfLongestSubstring(s));
    }
}
