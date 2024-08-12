package seminars.sem2.task1;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int sequenceAmount = 100;
        //int number = new Random().nextInt(100);
        System.out.println("\nSum is " + getSum(sequenceAmount));
    }

    /**
     * @param sequenceAmount amount of numbers in sequence
     * @return Sum of the sequence
     * @apiNote Дана последовательность из N целых чисел.
     * Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число
     */
    private static int getSum(int sequenceAmount) {
        int sum = 0;
        int current = new Random().nextInt(20);
        System.out.print("[ " + current + " ");
        for (int i = 0; i < sequenceAmount; i++) {
            int next = new Random().nextInt(20);
            if (next % 10 == 5 && current % 2 == 0) {
                sum += next;
            }
            System.out.print(next + " ");
            current = next;
        }
        System.out.print("]");
        return sum;
    }
}
