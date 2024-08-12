package Tasks_0001_0050.Task_0013_RomanToInt;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    static Map<Character, Integer> map1 = new HashMap<>();
    public static void main(String[] args) {
        {
            map1.put('I', 1);
            map1.put('V', 5);
            map1.put('X', 10);
            map1.put('L', 50);
            map1.put('C', 100);
            map1.put('D', 500);
            map1.put('M', 1000);
        }
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    /**
     * @param s - String of symbols
     * @return number
     * @apiNote Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     * <p>
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, 2 is written as II in Roman numeral, just two ones added together.
     * 12 is written as XII, which is simply X + II.
     * The number 27 is written as XXVII, which is XX + V + II.
     * <p>
     * Roman numerals are usually written largest to smallest from left to right.
     * However, the numeral for four is not IIII.
     * Instead, the number four is written as IV.
     * Because the one is before the five we subtract it making four.
     * The same principle applies to the number nine, which is written as IX.
     * There are six instances where subtraction is used:
     * <p>
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer.
     */
    public static int romanToInt(String s) {
        int number = 0;
        int previous = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = map1.get(s.charAt(i));
            if (current < previous) {
                number -= current;
            } else {
                number += current;
            }
            previous = current;
        }
        return number;
    }
}
