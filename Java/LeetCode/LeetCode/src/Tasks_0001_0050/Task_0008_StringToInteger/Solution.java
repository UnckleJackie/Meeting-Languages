package Tasks_0001_0050.Task_0008_StringToInteger;

public class Solution {
    public static void main(String[] args) {
        String s1 = "42";
        String s2 = "   -42";
        String s3 = "4193 with words";
        System.out.println(myAtoi(s1));
        System.out.println(myAtoi(s2));
        System.out.println(myAtoi(s3));
    }

    /**
     * @apiNote https://leetcode.com/problems/string-to-integer-atoi/description/
     * Implement the myAtoi(string s) function, which converts a string to a 32-bit
     * signed integer (similar to C/C++'s atoi function).
     *
     * The algorithm for myAtoi(string s) is as follows:
     *
     * Read in and ignore any leading whitespace.
     * Check if the next character (if not already at the end of the string) is '-' or '+'.
     * Read this character in if it is either.
     * This determines if the final result is negative or positive respectively.
     * Assume the result is positive if neither is present.
     * Read in next the characters until the next non-digit character or the end
     * of the input is reached. The rest of the string is ignored.
     * Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32).
     * If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
     * If the integer is out of the 32-bit signed integer range [-231, 231 - 1],
     * then clamp the integer so that it remains in the range. Specifically,
     * integers less than -231 should be clamped to -231,
     * and integers greater than 231 - 1 should be clamped to 231 - 1.
     * Return the integer as the final result.
     *    Note:
     * Only the space character ' ' is considered a whitespace character.
     * Do not ignore any characters other than the leading whitespace or the rest
     * of the string after the digits.
     * @param s
     * @return
     */
    public static int myAtoi(String s) {
        s = s.trim(); // delete beginning and ending whitespaces
        if (s.isEmpty()) return 0;

        int sign = 1; // 1 for positive number, -1 for negative
        int result = 0;
        int i = 0;

        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            if (s.charAt(i) == '-')
                sign = -1;
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }
}
