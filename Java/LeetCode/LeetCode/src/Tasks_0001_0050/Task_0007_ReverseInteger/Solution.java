package Tasks_0001_0050.Task_0007_ReverseInteger;

public class Solution {
    public static void main(String[] args) {
        int numberOne = 123;
        int numberTwo = -123;
        int numberThree = 120;
        System.out.println(reverse(numberOne));
        System.out.println(reverse(numberTwo));
        System.out.println(reverse(numberThree));
    }

    /**
     * @apiNote https://leetcode.com/problems/reverse-integer/description/
     * Given a signed 32-bit integer x, return x with its digits reversed.
     * If reversing x causes the value to go outside the signed
     * 32-bit integer range [-231, 231 - 1], then return 0.
     * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
     * Example 1:
     * Input: x = 123
     * Output: 321
     * Example 2:
     * Input: x = -123
     * Output: -321
     * Example 3:
     * Input: x = 120
     * Output: 21
     * 1. Transform int to String
     * 2. Reverse String
     * 3. reverseString to int
     * 4. Check is 32-bit number
     * @param x
     * @return
     */
    public static int reverse(int x) {
        String s;
        if (x < 0) {
            s = String.valueOf(-x); // Transform negative number to String, delete "-"
            s = "-" + new StringBuilder(s).reverse().toString();    // reverse string, add "-"
        } else {
            s = new StringBuilder(String.valueOf(x)).reverse().toString();
        }
        int result = Integer.parseInt(s);   // Transform String to Integer
        if (result < -Math.pow(2, 31) || result > Math.pow(2, 31) - 1) {
            return 0;
        } else {
            return result;

        }
    }
}
