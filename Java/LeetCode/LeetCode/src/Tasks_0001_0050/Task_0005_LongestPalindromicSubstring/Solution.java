package Tasks_0001_0050.Task_0005_LongestPalindromicSubstring;

import static java.lang.System.out;

public class Solution {
    public static void main(String[] args) {
        String s1 = "babad";
        String s2 = "cbbd";

        out.println(longestPalindrome(s1));
        out.println(longestPalindrome(s2));
    }

    /** @apiNote https://leetcode.com/problems/longest-palindromic-substring/description/
     * Given a string s, return the longest palindromic substring in s.
     * Example 1:
     * Input: s = "babad"
     * Output: "bab"
     * Explanation: "aba" is also a valid answer.
     * Example 2:
     * Input: s = "cbbd"
     * Output: "bb"
     *
     * Constraints:
     * 1 <= s.length <= 1000
     * s consist of only digits and English letters.
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        int stringLength = s.length();
        boolean[][] dp = new boolean[stringLength][stringLength];
        int start = 0, maxLen = 1;

        for (int i = 0; i < stringLength; i++) {
            dp[i][i] = true;
        }

        for (int len = 2; len <= stringLength; len++) {
            for (int i = 0; i < stringLength - len + 1; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    if (len == 2 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        if (len > maxLen) {
                            start = i;
                            maxLen = len;
                        }
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}
