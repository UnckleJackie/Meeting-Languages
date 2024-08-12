package seminars.sem2.task2;

import java.util.Random;

/**
 * @apiNote Дан массив целых чисел.
 * Найти кол-во пар соседних элементов, где первый элемент вдвое больше второго
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
        }
        System.out.println("\nCount is " + getCount(arr));
    }

    /**
     * @param arr Array of numbers
     * @return count
     * @apiNote Дан массив целых чисел.
     * Найти кол-во пар соседних элементов, где первый элемент вдвое больше второго
     */
    private static int getCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] * 2 == arr[i]) {
                count++;
            }
        }
        return count;
    }
}
