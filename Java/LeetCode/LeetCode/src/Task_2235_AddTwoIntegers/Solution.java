package Task_2235_AddTwoIntegers;

import java.util.Random;
import static java.lang.System.out;

public class Solution {
    public static void main(String[] args) {
        int firstNumber = new Random().nextInt();
        out.println(firstNumber);
        int secondNumber = new Random().nextInt();
        out.println(secondNumber);
        out.println(sum(firstNumber, secondNumber));
    }
    public static int sum(int num1, int num2) {
        int sum;
        sum = num1 + num2;
        return sum;
    }
}
