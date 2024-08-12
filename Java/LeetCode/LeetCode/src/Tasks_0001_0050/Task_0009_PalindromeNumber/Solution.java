package Tasks_0001_0050.Task_0009_PalindromeNumber;

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        int number;
        int attempt = 0;
        do {
            number = new Random().nextInt();
            isPalindrome(number);
            attempt++;
            //System.out.println(number);
        }
        while (!isPalindrome(number));
        System.out.println("Number is: " + number + ", attempts: " + attempt);
    }
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversedNum = 0;
        int originalX = x;
        while (x > reversedNum) {
            reversedNum = reversedNum * 10 + x % 10;
            x /= 10;
        }
        return (x == reversedNum) || (x == reversedNum / 10) ;
    }
}
