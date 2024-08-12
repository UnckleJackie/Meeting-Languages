package Alg_01_MinItemInArray;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int rand = new Random().nextInt(20) + 5;
        int[] array = new int[rand];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
            System.out.print(array[i] + " ");
        }

        minItemInArray(array);
        maxItemInArray(array);
    }

    private static void minItemInArray(int[] array) {
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("\nmin value: " + minValue +
                "\nmin index: " + minIndex);
    }
    private static void maxItemInArray(int[] array) {
        int maxValue = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        System.out.println("\nmax value: " + maxValue +
                "\nmax index: " + maxIndex);
    }
}
