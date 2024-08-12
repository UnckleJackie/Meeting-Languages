package Tasks_0001_0050.Task_0003_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

public class Solution {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        out.println(lengthOfLongestSubstring(s1));
        out.println(lengthOfLongestSubstring(s2));
        out.println(lengthOfLongestSubstring(s3));
    }

    /** @apiNote https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
     * Given a string s, find the length of the longest
     * substring without repeating characters.
     *
     * Example 1:
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     *
     * Example 2:
     * Input: s = "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     *
     * Example 3:
     * Input: s = "pwwkew"
     * Output: 3
     *
     * Explanation: The answer is "wke", with the length of 3.
     * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     *
     * Constraints:
     * 0 <= s.length <= 5 * 104
     * s consists of English letters, digits, symbols and spaces.
     * @param s
     * @return
     */

    public static int lengthOfLongestSubstring(String s) {
        int stringLength = s.length();
        Set<Character> set = new HashSet<>();
        int substringLength = 0, i = 0, j = 0;
        while (i < stringLength && j < stringLength) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                substringLength = Math.max(substringLength, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        System.out.println(set);
        return substringLength;
    }



    //    public static int lengthOfLongestSubstring(String s) {
//        int stringLength = s.length();
//        Set<Character> set = new HashSet<>(); // create set for store of unique symbols in curr substring
//        int substringLength = 0, i = 0, j = 0;
//        while (i < stringLength && j < stringLength) {
//            if (!set.contains(s.charAt(j))) {
//                set.add(s.charAt(j++));
//                substringLength = Math.max(substringLength, j - 1);
//            } else {
//                set.remove(s.charAt(i++));
//            }
//        }
//        return substringLength;
//    }
//    public static int lengthOfLongestSubstring(String s) {
//        int n = s.length();
//        Set<Character> set = new HashSet<>();
//        int ans = 0, i = 0, j = 0;
//        while (i < n && j < n) {
//            if (!set.contains(s.charAt(j))) {
//                set.add(s.charAt(j++));
//                ans = Math.max(ans, j - 1);
//            } else {
//                set.remove(s.charAt(i++));
//            }
//        }
//        return ans;
//    }
//
}
