/*
Given a string s, find the length of the longest substring without duplicate characters.
Concept: Sliding window
*/

import java.util.HashSet;
public class LongestSubString {
    public static int longestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        HashSet<Character> charSet = new HashSet<>();
        int maxLength = 0;
        int left = 0; // Left pointer of the sliding window
        for (int right = 0; right < n; right++) 
        {
            char currentChar = s.charAt(right);
            // Shrink the window from the left if the current character is already in the set
             while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set and expand the window
            charSet.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1); // Update max length
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Longest SubString in "+s+" is: "+ longestSubstring(s));
    }
}
