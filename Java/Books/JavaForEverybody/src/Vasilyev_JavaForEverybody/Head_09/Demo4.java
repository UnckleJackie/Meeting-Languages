package Vasilyev_JavaForEverybody.Head_09;

import java.util.Random;

public class Demo4 {
    public static void main(String[] args) {
        Random r = new Random();
        int a, b;
        int nums[] = {-1, 1};
        for (int k = 1; k <= 5; k++) {
            System.out.println("Try #" + k);
            try {
                a = r.nextInt(3);
                b = 100 / a;
                System.out.println("b = " + b);
                try {
                    if (a == 1) a = a / (a - 1);
                    else nums[a] = 200;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Error index: " + e);
                } finally {
                    System.out.println("Trere's always error!");
                }
            } catch (ArithmeticException e) {
                System.out.println("Dividing to zero: " + e);
            }
        }
    }
}
