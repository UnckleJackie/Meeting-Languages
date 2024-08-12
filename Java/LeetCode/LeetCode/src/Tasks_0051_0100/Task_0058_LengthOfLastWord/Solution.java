package Tasks_0051_0100.Task_0058_LengthOfLastWord;

/**
 * @apiNote https://leetcode.com/problems/length-of-last-word/description/?envType=daily-question&envId=2024-04-01
 * Description
 * Given a string s consisting of words and spaces, return the length of the last word
 * in the string. A word is a maximal substring consisting of non-space characters only.

 *      Example 1:
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 *      Example 2:
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 *      Example 3:
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.

 * Constraints:
 * 1 <= s.length <= 104
 * s consists of only English letters and spaces ' '.
 * There will be at least one word in s.
 *
 *      Solutions
 * Solution 1: Reverse Traversal + Two Pointers
 * We start traversing from the end of the string
 * , find the first character that is not a space, which is the last character of the last word, and mark the index as
 * . Then continue to traverse forward, find the first character that is a space, which is the character before the first character of the last word, and mark it as
 * . Then the length of the last word is i - j.
 *
 * The time complexity is O(n), where n
 * is the length of the string s. The space complexity is O(1).
 * .
 */
public class Solution {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "    fly me    to    the moon    ";
        String s3 = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(s1));
        System.out.println(lengthOfLastWord(s2));
        System.out.println(lengthOfLastWord(s3));
    }
    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        System.out.println("Length of String is " + s.length() + ", i = " + i);
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        int j = i;
        while (j >= 0 && s.charAt(j) != ' ') {
            j--;
        }
        return i - j;
    }
}
