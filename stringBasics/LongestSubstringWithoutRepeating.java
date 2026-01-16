package stringBasics;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {

        String s = "abcabcbb";

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            // If duplicate found, shrink window
            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(current);

            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Longest length: " + maxLength);
    }
}
// 2nd problem