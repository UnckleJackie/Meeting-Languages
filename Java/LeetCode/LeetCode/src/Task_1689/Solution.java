package Task_1689;

import java.util.Random;

import static java.lang.System.out;

// Децибинарное число - десятичное число, в записи которого используются только цифры 0 и 1
// 567805 = 111101 (x5) + 11100 + 1100 + 100
// 111101
// 111101
// 111101
// 111101
// 111101
//  11100
//   1100
//    100
public class Solution {
    public static void main(String[] args) {
        String n1 = "32";
        String n2 = "82734";
        String n3 = "27346209830709182346";

        out.println(minPartitions(n1));
        out.println(minPartitions(n2));
        out.println(minPartitions(n3));
    }
    /**
     * @apiNote A decimal number is called deci-binary if each of its digits is either 0 or 1
     * without any leading zeros. For example, 101 and 1100 are deci-binary,
     * while 112 and 3001 are not.
     *
     * Given a string n that represents a positive decimal integer, return the minimum number
     * of positive deci-binary numbers needed so that they sum up to n
     * @param n = input number on String-view
     * @return
     */
    public static int minPartitions(String n) {
        int len = n.length();
        char max = '0';
        for (int i = 0; i < len; i++) {
            char symbol = n.charAt(i);
            //System.out.print(symbol);
            if (symbol > max) {
                max = symbol;
            }
        }
        return max - '0';
    }
}
