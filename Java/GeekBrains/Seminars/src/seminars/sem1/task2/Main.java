package seminars.sem1.task2;

import java.util.Random;
import java.util.Scanner;

/* Дана последовательность целых чисел. (5, 1, -3, -3, 2, -1)
Найти кол-во положительных чисел, после которых следуют отрицательные числа
 */
public class Main {
    public static void main(String[] args) {
        int rand = new Random().nextInt(100);
        int n = new Random().nextInt(20);
        System.out.println("Amount of row numbers: " + n);
        int count = 0;
        count = getCount(rand, n, count);
        System.out.println("\nPositive numbers before neganive number: " + count);
    }

    /**
     * @apiNote extended describe
     * Дана последовательность N целых чисел.
     * Найти количество положительных чисел, после которых следует отрицательное число.
     * @param n - amount of numbers row
     * @param count
     * @return
     */
    private static int getCount(int rand, int n, int count) {
        int currentNumber = new Random().nextInt(100);
        System.out.print(currentNumber);

        for (int i = 0; i < n - 1; i++) {
            int nextNumber = new Random().nextInt(100) - 50;
            System.out.print(nextNumber + ", ");
            if (currentNumber > 0 && nextNumber < 0) {
                count++;
            }
            currentNumber = nextNumber;
        }
        return count;
    }
}
